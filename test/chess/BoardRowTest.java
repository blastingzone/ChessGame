package chess;

import junit.framework.TestCase;

public class BoardRowTest extends TestCase {
	
	public void testAddBlackPiece() throws Exception {
		BoardRow boardRow = new BoardRow();
		boardRow.rowAddBlackPieces();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < Board.colLength; i++) {
			stringBuilder.append(boardRow.boardPieceRow.get(i).getRepresentation());
		}
		String result = stringBuilder.toString();
		assertEquals("RNBQKBNR", result);
	}
	
	public void testAddWhitePiece() throws Exception {
		BoardRow boardRow = new BoardRow();
		boardRow.rowAddWhitePieces();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < Board.colLength; i++) {
			stringBuilder.append(boardRow.boardPieceRow.get(i).getRepresentation());
		}
		String result = stringBuilder.toString();
		assertEquals("rnbqkbnr", result);
	}
	
	public void testAddWhitePawn() throws Exception {
		BoardRow boardRow = new BoardRow();
		boardRow.rowAddWhitePawn();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < Board.colLength; i++) {
			stringBuilder.append(boardRow.boardPieceRow.get(i).getRepresentation());
		}
		String result = stringBuilder.toString();
		assertEquals("pppppppp", result);
	}
}