package pieces;
import junit.framework.TestCase;
import pieces.Piece;
import static pieces.Piece.*;
import static pieces.Piece.ColorList.*;

public class PieceTest extends TestCase {

	public void testIsWhite() throws Exception {
		Piece testPiece = Piece.createWhiteBishop();
		assertTrue(testPiece.isWhite());
	}
	
	public void testIsBlack() throws Exception {
		Piece testPiece = Piece.createBlackBishop();
		assertTrue(testPiece.isBlack());
	}
	public void testCreate() throws Exception {
		verifyCreation(Piece.createWhitePawn(), Piece.createBlackPawn(),
				PieceType.PAWN_REPRESENTATION, PieceType.PAWN_REPRESENTATION.getName());
		verifyCreation(Piece.createWhiteRook(), Piece.createBlackRook(),
				PieceType.ROOK_REPRESENTATION, PieceType.ROOK_REPRESENTATION.getName());
		verifyCreation(Piece.createWhiteKnight(), Piece.createBlackKnight(),
				PieceType.KNIGHT_REPRESENTATION, PieceType.KNIGHT_REPRESENTATION.getName());
		verifyCreation(Piece.createWhiteBishop(), Piece.createBlackBishop(),
				PieceType.BISHOP_REPRESENTATION, PieceType.BISHOP_REPRESENTATION.getName());
		verifyCreation(Piece.createWhiteQueen(), Piece.createBlackQueen(),
				PieceType.QUEEN_REPRESENTATION, PieceType.QUEEN_REPRESENTATION.getName());
		verifyCreation(Piece.createWhiteKing(), Piece.createBlackKing(),
				PieceType.KING_REPRESENTATION, PieceType.KING_REPRESENTATION.getName());
		Piece blank = Piece.noPiece();
		assertEquals('.', blank.getRepresentation());
		assertEquals(E.getColor(), blank.getColor());
	}
	
	private void verifyCreation(Piece whitePiece, Piece blackPiece, PieceType type, char representation) {
		assertTrue(whitePiece.isWhite());
		assertEquals(type, whitePiece.getType());
		assertEquals(representation, whitePiece.getRepresentation());
		
		assertTrue(blackPiece.isBlack());
		assertEquals(Character.toUpperCase(representation), blackPiece.getRepresentation());
	}
}