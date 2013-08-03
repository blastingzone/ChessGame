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
	
	public void testPieceNumber() throws Exception {
		int result = board.numOfPieceByEqualPiece(Piece.createBlackBishop());
		assertEquals(2, result);
		result = board.numOfPieceByEqualPiece(Piece.createBlackQueen());
		assertEquals(1, result);
		result = board.numOfPieceByEqualPiece(Piece.createWhitePawn());
		assertEquals(8, result);
	}
}
