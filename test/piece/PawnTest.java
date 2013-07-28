package piece;
import piece.Pawn;
import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		
		Pawn cutiePawn = new Pawn(Pawn.W);
		assertEquals(Pawn.W, cutiePawn.getColor());
		
		cutiePawn.color = Pawn.B;
		assertEquals(Pawn.B, cutiePawn.getColor());
	}
	public void testWithoutColor() throws Exception {
		Pawn noColorPawn = new Pawn();
	}
}
