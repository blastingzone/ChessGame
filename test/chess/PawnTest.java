package chess;
import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		
		Pawn cutiePawn = new Pawn("White");
		String pawnColor = cutiePawn.getColor();
		assertEquals("White", pawnColor);
		
		Pawn prettyPawn = new Pawn("Black");
		pawnColor = prettyPawn.getColor();
		assertEquals("Black", pawnColor);
	}
	public void testWithoutColor() throws Exception {
		Pawn noColorPawn = new Pawn();
	}
}
