package chess;
import junit.framework.TestCase;
import piece.Pawn;


public class BoardTest extends TestCase {
	
	static final String NEWLINE = System.getProperty("line.separator");
	
	Board board = new Board();
	
	public void testCreateBoard() throws Exception {
		assertEquals(0, board.pieceNumber());
		
		board.initialize();
		
		BoardRow testBoard = board.chessBoard.get(1);
		for (int i = 0; i < 8; i++) {
			assertEquals('P', testBoard.boardPieceRow.get(i).getType());
		}
		
		testBoard = board.chessBoard.get(6);
		for (int i = 0; i < 8; i++) {
			assertEquals('p', testBoard.boardPieceRow.get(i).getType());
		}
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
	public void testInsertIntgerToBoard() throws Exception {
		//연습문제 2-8 : 아래 주석을 해제하면 컴파일 에러
		//board.addPiece(new Integer("7"));
	}
	
	public void testPrintChessBoard() throws Exception {
		
		board.initialize();
		
		String chessBoard = "";
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				chessBoard += board.chessBoard.get(i).boardPieceRow.get(j).getType();
			}
			chessBoard += NEWLINE;
		}
		System.out.println(chessBoard);
	}
}
