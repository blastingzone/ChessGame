import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		
		final String A = "White";
		final String B = "Black";
		
		Pawn cutiePawn = new Pawn(A);
		String pawnColor = cutiePawn.getColor();
		assertEquals(pawnColor, A);
		
		Pawn prettyPawn = new Pawn(B);
		pawnColor = prettyPawn.getColor();
		assertEquals(B, pawnColor);
	}
}
