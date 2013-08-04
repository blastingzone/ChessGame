package chess;

import pieces.Piece;
import junit.framework.TestCase;
import util.StringUtil;

public class BoardTest extends TestCase {

	Board board = new Board();

	public void testCreateBoard() throws Exception {

		board.initialBoard();
		assertEquals(32, board.pieceCount());
		String blankRank = StringUtil.appendNewLine("........");
		assertEquals(
				StringUtil.appendNewLine("RNBQKBNR")
						+ StringUtil.appendNewLine("PPPPPPPP") + blankRank
						+ blankRank + blankRank + blankRank
						+ StringUtil.appendNewLine("pppppppp")
						+ StringUtil.appendNewLine("rnbqkbnr"), board.print());

		System.out.println(board.print());
	}
	
	//정확히 일치하는 말의 갯수 찾는 메소드
	public void testPieceNumber() throws Exception {
		int result = board.numOfPieceByEqualPiece(Piece.createBlackBishop());
		assertEquals(2, result);
		result = board.numOfPieceByEqualPiece(Piece.createBlackQueen());
		assertEquals(1, result);
		result = board.numOfPieceByEqualPiece(Piece.createWhitePawn());
		assertEquals(8, result);
	}
	
	//주어진 위치의 말을 가져오는 메소드
	//위에서 아래로 1, 2, 3, 4, ... 8 순서(교재와 반대)
	public void testgetPieceByXY() throws Exception {
		assertEquals(Piece.createBlackRook().getRepresentation(), board.getPieceByXY("a1").getRepresentation());
		assertEquals(Piece.createWhiteRook().getRepresentation(), board.getPieceByXY("h8").getRepresentation());
		assertEquals(Piece.createWhiteKing().getRepresentation(), board.getPieceByXY("e8").getRepresentation());
		assertEquals(Piece.createBlackQueen().getRepresentation(), board.getPieceByXY("d1").getRepresentation());
		assertEquals(Piece.noPiece().getRepresentation(), board.getPieceByXY("e4").getRepresentation());
	}
}
