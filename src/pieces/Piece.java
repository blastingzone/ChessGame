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
		
		public String getColor() {
			return color;
		}
	}
	
	public enum PieceType {
		PAWN_REPRESENTATION('p', 0.5),
		KNIGHT_REPRESENTATION('n', 2.5),
		ROOK_REPRESENTATION('r', 5.0),
		BISHOP_REPRESENTATION('b', 3.0),
		QUEEN_REPRESENTATION('q', 9.0),
		KING_REPRESENTATION('k', 0.0),
		NO_PIECE('.', 0.0);
		
		char name;
		double value;
		
		private PieceType(char name, double value) {
			this.name = name;
			this.value = value;
		}
		
		char getName() {
			return name;
		}
		
		double getValue() {
			return value;
		}
	}
	
	ColorList colorType;
	PieceType type;
	double value;
	char representation;

	
	static Piece create(PieceType name, ColorList color) {
		return new Piece(name,color);
	}

	private Piece(PieceType name, ColorList color) {
		type = name;
		representation = name.getName();
		value = name.getValue();
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
	
	public double getValue() {
		return value;
	}
	
	public char getRepresentation() {
		return representation;
	}
	
	public void setValue(double value) {
		this.value = value;
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
