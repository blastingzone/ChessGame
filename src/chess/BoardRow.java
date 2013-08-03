package chess;

import java.util.ArrayList;

import pieces.Piece;

public class BoardRow {
	ArrayList<Piece> boardPieceRow;
	Piece initialPawn = Piece.noPiece();

	BoardRow() {
		boardPieceRow = new ArrayList<Piece>();
	}

	void rowAddWhitePawn() {
		for (int i = 0; i < 8; i++) {
			boardPieceRow.add(Piece.createWhitePawn());
		}
	}
	
	void rowAddBlackPawn() {
		for (int i = 0; i < 8; i++) {
			boardPieceRow.add(Piece.createBlackPawn());
		}
	}
	
	void rowAddBlank() {
		for (int i = 0; i < 8; i++) {
			boardPieceRow.add(initialPawn);
		}
	}
	
	void rowAddWhitePieces() {
		boardPieceRow.add(Piece.createWhiteRook());
		boardPieceRow.add(Piece.createWhiteKnight());
		boardPieceRow.add(Piece.createWhiteBishop());
		boardPieceRow.add(Piece.createWhiteQueen());
		boardPieceRow.add(Piece.createWhiteKing());
		boardPieceRow.add(Piece.createWhiteBishop());
		boardPieceRow.add(Piece.createWhiteKnight());
		boardPieceRow.add(Piece.createWhiteRook());
	}
	
	void rowAddBlackPieces() {
		boardPieceRow.add(Piece.createBlackRook());
		boardPieceRow.add(Piece.createBlackKnight());
		boardPieceRow.add(Piece.createBlackBishop());
		boardPieceRow.add(Piece.createBlackQueen());
		boardPieceRow.add(Piece.createBlackKing());
		boardPieceRow.add(Piece.createBlackBishop());
		boardPieceRow.add(Piece.createBlackKnight());
		boardPieceRow.add(Piece.createBlackRook());
	}

}
