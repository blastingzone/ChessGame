import java.util.ArrayList;

public class Board {
	ArrayList board;

	Board() {
		board = new ArrayList();
	}

	int pieceNumber() {

		return board.size();
	}

	void addPiece(Pawn pawn) {
		board.add(pawn);
	}
	
	boolean contain(Pawn pawn) {
		return board.contains(pawn);
	}
}
