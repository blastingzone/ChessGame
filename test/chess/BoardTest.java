package chess;

import pieces.Piece;
import junit.framework.TestCase;
import util.StringUtil;

public class BoardTest extends TestCase {

	Board board = new Board();
	@Override
	protected void setUp() throws Exception {
		board.initialBoard();
	}

	public void testCreateBoard() throws Exception {

		board.initialBoard();
		
		//기본 말을 다 채웠을 때 테스트 함수
//		assertEquals(32, board.pieceCount());
//		String blankRank = StringUtil.appendNewLine("........");
//		assertEquals(
//				StringUtil.appendNewLine("RNBQKBNR")
//						+ StringUtil.appendNewLine("PPPPPPPP") + blankRank
//						+ blankRank + blankRank + blankRank
//						+ StringUtil.appendNewLine("pppppppp")
//						+ StringUtil.appendNewLine("rnbqkbnr"), board.print());

//		System.out.println(board.print());
	}
	
	/*
	 * 정확히 일치하는 말의 갯수 찾는 메소드
	 */
	public void testPieceNumber() throws Exception {
		
		//기본 말을 다 채웠을 때 테스트 함
//		int result = board.numOfPieceByEqualPiece(Piece.createBlackBishop());
//		assertEquals(2, result);
//		result = board.numOfPieceByEqualPiece(Piece.createBlackQueen());
//		assertEquals(1, result);
//		result = board.numOfPieceByEqualPiece(Piece.createWhitePawn());
//		assertEquals(8, result);
	}
	
	 
	/*
	 * 주어진 위치의 말을 가져오는 메소드
	 * 위에서 아래로 1, 2, 3, 4, ... 8 순서(교재와 반대)
	 */
	public void testgetPieceByXY() throws Exception {
		
		//기본 말을 다 채웠을 때 테스트 함수
//		assertEquals(Piece.createBlackRook().getRepresentation(), board.getPieceByXY("a1").getRepresentation());
//		assertEquals(Piece.createWhiteRook().getRepresentation(), board.getPieceByXY("h8").getRepresentation());
//		assertEquals(Piece.createWhiteKing().getRepresentation(), board.getPieceByXY("e8").getRepresentation());
//		assertEquals(Piece.createBlackQueen().getRepresentation(), board.getPieceByXY("d1").getRepresentation());
//		assertEquals(Piece.noPiece().getRepresentation(), board.getPieceByXY("e4").getRepresentation());
	}
	
	public void testAddPieceByXY() throws Exception {
		board.addPieceByXY("b3", Piece.createBlackRook());
		assertEquals(Piece.createBlackRook().getRepresentation(), board.getPieceByXY("b3").getRepresentation());
		board.addPieceByXY("a6", Piece.createWhiteQueen());
		assertEquals(Piece.createWhiteQueen().getRepresentation(), board.getPieceByXY("a6").getRepresentation());
		board.addPieceByXY("a8", Piece.createBlackKing());
		assertEquals(Piece.createBlackKing().getRepresentation(), board.getPieceByXY("a8").getRepresentation());
//		System.out.println(board.print());
	}
	
	public void testGetValue() throws Exception {
		board.getTotalValue();
		assertEquals(0.0, board.getBlackValue());
		board.addPieceByXY("a1", Piece.createBlackRook());
		board.getTotalValue();
		assertEquals(5.0, board.getBlackValue());
		board.addPieceByXY("a2", Piece.createWhitePawn());
		board.addPieceByXY("b2", Piece.createWhitePawn());
		board.addPieceByXY("c2", Piece.createWhitePawn());
		board.addPieceByXY("c3", Piece.createWhitePawn());
		board.addPieceByXY("c4", Piece.createWhitePawn());
		board.getTotalValue();
		assertEquals(4.0, board.getWhiteValue());
		assertEquals(5.0, board.getBlackValue());
		board.addPieceByXY("e6", Piece.createWhiteQueen());
		board.addPieceByXY("f7", Piece.createBlackKnight());
		board.getTotalValue();
		assertEquals(13.0, board.getWhiteValue());
		assertEquals(7.5, board.getBlackValue());
		System.out.println(board.print());
	}
}
