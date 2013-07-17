package chess;
import java.util.ArrayList;

public class Board {
	ArrayList board;

	Board() {
		board = new ArrayList();
	}

	int pieceNumber() {
		return board.size();
	}

	/**
	 * 체스판에 Pawn을 추가시키는 함수이다.
	 * @param pawn : 체스에 사용할 Pawn Class이다. Black / White Color값을 가질 수 있다.
	 */
	void addPiece(Pawn pawn) {
		board.add(pawn);
	}
	
	/**
	 * 
	 * @param pawn : Pawn Class의 Instance
	 * @return 해당 pawn이 있으면 true, 없으면 false
	 */
	boolean contain(Pawn pawn) {
		return board.contains(pawn);
	}
}
