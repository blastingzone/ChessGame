package pieces;

import static pieces.Piece.ColorList.*;
import static pieces.Piece.PieceType.*;

public class Piece {
	
	enum ColorList {
		B("Black"), W("White"), E("Empty");
		
		private String color;
		
		ColorList(String string) {
			color = string;
		}
		
		String getColor() {
			return color;
		}
	}
	
	public enum PieceType {
		PAWN_REPRESENTATION('p'),
		KNIGHT_REPRESENTATION('n'),
		ROOK_REPRESENTATION('r'),
		BISHOP_REPRESENTATION('b'),
		QUEEN_REPRESENTATION('q'),
		KING_REPRESENTATION('k'),
		NO_PIECE('.');
		
		char name;
		
		private PieceType(char name) {
			this.name = name;
		}
		
		char getName() {
			return name;
		}
	}
	
	ColorList colorType;
	PieceType type;
	char representation;

	
	
	//이름을 체크하는 기능이 필요할 것이다.
	//1) 중복인지 2) 체스에 없는 이름인지
	static Piece create(PieceType name, ColorList color) {
		return new Piece(name,color);
	}

	private Piece(PieceType name, ColorList color) {
		type = name;
		representation = name.getName();
		setType(color);
	}
	
	public String getColor() {
		return colorType.getColor();
	}
	
	public ColorList getColorType() {
		return colorType;
	}
	
	public PieceType getType() {
		return type;
	}
	
	public char getRepresentation() {
		return representation;
	}
	
	private void setType(ColorList color) {
		colorType = color;
		if (color == B)
			representation = Character.toUpperCase(representation);
		else if (color == W)
			return;
		else
			representation = NO_PIECE.getName();
	}

	public boolean isWhite() {
		if (colorType == W)
			return true;
		else
			return false;
	}
	
	public boolean isBlack() {
		if (colorType == B)
			return true;
		else
			return false;
	}

	public static Piece createWhitePawn() {
		return new Piece(PAWN_REPRESENTATION, W);
	}
	
	public static Piece createBlackPawn() {
		return new Piece(PAWN_REPRESENTATION, B);
	}
	
	public static Piece createWhiteRook() {
		return new Piece(ROOK_REPRESENTATION, W);
	}
	
	public static Piece createBlackRook() {
		return new Piece(ROOK_REPRESENTATION, B);
	}
	
	public static Piece createWhiteKnight() {
		return new Piece(KNIGHT_REPRESENTATION, W);
	}
	
	public static Piece createBlackKnight() {
		return new Piece(KNIGHT_REPRESENTATION, B);
	}
	
	public static Piece createWhiteBishop() {
		return new Piece(BISHOP_REPRESENTATION, W);
	}
	
	public static Piece createBlackBishop() {
		return new Piece(BISHOP_REPRESENTATION, B);
	}
	
	public static Piece createWhiteQueen() {
		return new Piece(QUEEN_REPRESENTATION, W);
	}
	
	public static Piece createBlackQueen() {
		return new Piece(QUEEN_REPRESENTATION, B);
	}
	
	public static Piece createWhiteKing() {
		return new Piece(KING_REPRESENTATION, W);
	}
	
	public static Piece createBlackKing() {
		return new Piece(KING_REPRESENTATION, B);
	}
	
	public static Piece noPiece() {
		return new Piece(NO_PIECE, E);
	}
}
