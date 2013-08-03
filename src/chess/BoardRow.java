package chess;

import java.util.ArrayList;

import pieces.Piece;

public class BoardRow {
	ArrayList<Piece> boardPieceRow;
	Piece initialPawn = Piece.create(Piece.PAWN, "EMPTY");

	BoardRow() {
		boardPieceRow = new ArrayList<Piece>();
	}

	void rowAddPawn(String color) {
		for (int i = 0; i < 8; i++) {
			boardPieceRow.add(Piece.create(Piece.PAWN, color));
		}
	}
	
	void rowAddBlank() {
		for (int i = 0; i < 8; i++) {
			boardPieceRow.add(initialPawn);
		}
	}
	
	void rowAddPieces(String color) {
		boardPieceRow.add(Piece.create(Piece.ROOK, color));
		boardPieceRow.add(Piece.create(Piece.KNIGHT, color));
		boardPieceRow.add(Piece.create(Piece.BISHOP, color));
		boardPieceRow.add(Piece.create(Piece.QUEEN, color));
		boardPieceRow.add(Piece.create(Piece.KING, color));
		boardPieceRow.add(Piece.create(Piece.BISHOP, color));
		boardPieceRow.add(Piece.create(Piece.KNIGHT, color));
		boardPieceRow.add(Piece.create(Piece.ROOK, color));
	}

}
