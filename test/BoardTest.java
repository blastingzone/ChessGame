import junit.framework.TestCase;


public class BoardTest extends TestCase {
	Board board = new Board();
	
	public void testCreateBoard() throws Exception {
		assertEquals(0, board.pieceNumber());
	}
	
	public void testAddPiece() throws Exception {
		Pawn whitePawn1 = new Pawn(); 
		Pawn blackPawn1 = new Pawn("Black");
		
		board.addPiece(whitePawn1);
		assertEquals(1, board.pieceNumber());
		assertEquals(true, board.contain(whitePawn1));
		board.addPiece(blackPawn1);
		assertEquals(2, board.pieceNumber());
		assertEquals(true, board.contain(blackPawn1));
	}
}
