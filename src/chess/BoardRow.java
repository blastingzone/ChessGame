package chess;

import java.util.ArrayList;

import piece.Pawn;

public class BoardRow {
	ArrayList<Pawn> boardPieceRow;
	Pawn initialPawn = new Pawn("EMPTY");

	BoardRow() {
		boardPieceRow = new ArrayList<Pawn>();
	}
	
	void rowInitialize() {
		for (int i = 0; i < 8; i++) {
			boardPieceRow.add(initialPawn);
		}
	}
	
	void rowSetWhitePawn() {
		for (int i = 0; i < 8; i++) {
			boardPieceRow.get(i).setColor(Pawn.W);
		}
	}
	
	void rowSetBlackPawn() {
		for (int i = 0; i < 8; i++) {
			boardPieceRow.get(i).setColor(Pawn.B);
		}
	}
}
