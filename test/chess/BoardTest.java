package chess;
import junit.framework.TestCase;


public class BoardTest extends TestCase {
	Board board = new Board();
	
	public void testCreateBoard() throws Exception {
		assertEquals(0, board.pieceNumber());
	}
	
	/**
	 * 체스판에 말을 추가하고 확인하는 테스트 함
	 */
	public void testAddPiece() throws Exception {
		/**
		 * Pawn() == Pawn("White");
		 */
		Pawn whitePawn1 = new Pawn(); 
		Pawn blackPawn1 = new Pawn(Pawn.B);
		
		board.addPiece(whitePawn1);
		assertEquals(1, board.pieceNumber());
		assertEquals(true, board.contain(whitePawn1));
		
		board.addPiece(blackPawn1);
		assertEquals(2, board.pieceNumber());
		assertEquals(true, board.contain(blackPawn1));
	}
}
