package piece;
import piece.Pawn;
import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		
		Pawn cutiePawn = new Pawn("White");
		assertEquals("White", cutiePawn.getColor());
		
		cutiePawn.color = "Black";
		assertEquals("Black", cutiePawn.getColor());
	}
	public void testWithoutColor() throws Exception {
		Pawn noColorPawn = new Pawn();
	}
}
