import junit.framework.TestCase;


public class BoardTest extends TestCase {
	public void testCreateBoard() throws Exception {
		Board board = new Board();
		assertEquals(true, board.isEmpty());
	}
}
