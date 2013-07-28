package chess;

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
}
