package chess;
import java.util.ArrayList;

import piece.Piece;

public class Board {
	ArrayList<Piece> pawnList;
	ArrayList<BoardRow> chessBoard;

	Board() {
		chessBoard = new ArrayList<BoardRow>();
		pawnList = new ArrayList<Piece>();
		initialBoard();
	}

	private void initialBoard() {
		for (int i = 0; i < 8 ;i++) {
			chessBoard.add(new BoardRow());
			chessBoard.get(i).rowInitialize();
		}
	}

	int pieceNumber() {
		return pawnList.size();
	}

	/**
	 * 체스판에 Pawn을 추가시키는 함수이다.
	 * @param pawn : 체스에 사용할 Pawn Class이다. Black / White Color값을 가질 수 있다.
	 */
	void addPiece(Piece pawn) {
		pawnList.add(pawn);
	}
	
	/**
	 * 
	 * @param pawn : Pawn Class의 Instance
	 * @return 해당 pawn이 있으면 true, 없으면 false
	 */
	boolean contain(Piece pawn) {
		return pawnList.contains(pawn);
	}
	
	void initialize() {
		chessBoard.get(1).rowSetBlackPawn();
		chessBoard.get(6).rowSetWhitePawn();
		for (int i = 0; i < 8; i++) {
			pawnList.add(Piece.create(Piece.PAWN, Piece.W));
			pawnList.add(Piece.create(Piece.PAWN, Piece.B));
		}
	}
}
