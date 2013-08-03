package chess;
import static util.StringUtil.NEWLINE;

import java.util.ArrayList;

import pieces.Piece;

public class Board {
	int numOfWhitePiece;
	int numOfBlackPiece;
	
	ArrayList<BoardRow> chessBoard;

	Board() {
		chessBoard = new ArrayList<BoardRow>();
		initialBoard();
	}

	void initialBoard() {
		for (int i = 0; i < 8; i++) {
			chessBoard.add(new BoardRow());
		}
		initializeAllRow();
	}
	
	private void initializeAllRow() {
		chessBoard.get(0).rowAddBlackPieces();
		chessBoard.get(1).rowAddBlackPawn();
		for (int i = 0; i < 6; i++) {
			chessBoard.get(i).rowAddBlank();
		}
		chessBoard.get(6).rowAddWhitePawn();
		chessBoard.get(7).rowAddWhitePieces();
	}
	
	String print() {

		String chessBoard = "";
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				chessBoard += this.chessBoard.get(i).boardPieceRow.get(j).getRepresentation();
			}
			chessBoard += NEWLINE;
		}
		return chessBoard;
	}
	
	int pieceCount() {
		Piece result;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				result = chessBoard.get(i).boardPieceRow.get(j);
				if (result.isWhite())
					numOfWhitePiece++;
				else if (result.isBlack())
					numOfBlackPiece++;
			}
		}
		return (this.numOfWhitePiece + this.numOfBlackPiece);
	}


	int countWhitePiece() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Piece result = chessBoard.get(i).boardPieceRow.get(j);
				if (result.isWhite())
					numOfWhitePiece++;
			}
		}
		return numOfWhitePiece;
	}
	
	int countBlackPiece() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Piece result = chessBoard.get(i).boardPieceRow.get(j);
				if (result.isBlack())
					numOfBlackPiece++;
			}
		}
		return numOfBlackPiece;
	}
}
