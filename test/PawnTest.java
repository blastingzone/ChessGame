import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() throws Exception {
		Pawn cutiePawn = new Pawn("White");
		String pawnColor = cutiePawn.getColor();
		assertEquals(pawnColor, "White");
	}
}
