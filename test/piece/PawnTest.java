package piece;
import piece.Piece;
import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		
		Piece cutiePawn = Piece.create(Piece.PAWN, Piece.W);
		assertEquals(Piece.W, cutiePawn.getColor());
		
		cutiePawn.color = Piece.B;
		assertEquals(Piece.B, cutiePawn.getColor());
	}
}
