package chess;

import java.util.ArrayList;

import piece.Piece;

public class BoardRow {
	ArrayList<Piece> boardPieceRow;
	Piece initialPawn = Piece.create(Piece.PAWN, "EMPTY");

	BoardRow() {
		boardPieceRow = new ArrayList<Piece>();
	}

	void rowInitialize() {
		for (int i = 0; i < 8; i++) {
			boardPieceRow.add(initialPawn);
		}
	}

	void rowSetWhitePawn() {
		for (int i = 0; i < 8; i++) {
			boardPieceRow.get(i).setColor(Piece.W);
		}
	}

	void rowSetBlackPawn() {
		for (int i = 0; i < 8; i++) {
			boardPieceRow.get(i).setColor(Piece.B);
		}
	}
}
