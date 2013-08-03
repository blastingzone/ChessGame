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
		chessBoard.get(0).rowAddPieces(Piece.B);
		chessBoard.get(1).rowAddPawn(Piece.B);
		for (int i = 0; i < 6; i++) {
			chessBoard.get(i).rowAddBlank();
		}
		chessBoard.get(6).rowAddPawn(Piece.W);
		chessBoard.get(7).rowAddPieces(Piece.W);
	}
	
	String print() {

		String chessBoard = "";
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				chessBoard += this.chessBoard.get(i).boardPieceRow.get(j).getName();
			}
			chessBoard += NEWLINE;
		}
		return chessBoard;
	}
	
	int pieceCount() {
		return (countWhitePiece() + countBlackPiece());
	}


	int countWhitePiece() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				String result = chessBoard.get(i).boardPieceRow.get(j).getColor();
				if (result == Piece.W)
					numOfWhitePiece++;
			}
		}
		return numOfWhitePiece;
	}
	
	int countBlackPiece() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				String result = chessBoard.get(i).boardPieceRow.get(j).getColor();
				if (result == Piece.B)
					numOfBlackPiece++;
			}
		}
		return numOfBlackPiece;
	}
}
