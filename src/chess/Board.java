package chess;
import static util.StringUtil.NEWLINE;

import java.util.ArrayList;

import pieces.Piece;

public class Board {
	public static final int rowLength = 8;
	public static final int colLength = 8;
	
	int numOfWhitePiece;
	int numOfBlackPiece;
	
	ArrayList<BoardRow> chessBoard;

	Board() {
		chessBoard = new ArrayList<BoardRow>();
		initialBoard();
	}

	void initialBoard() {
		for (int i = 0; i < rowLength; i++) {
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
		
		for(int i = 0; i < rowLength; i++) {
			for(int j = 0; j < colLength; j++) {
				chessBoard += this.chessBoard.get(i).boardPieceRow.get(j).getRepresentation();
			}
			chessBoard += NEWLINE;
		}
		return chessBoard;
	}
	
	int pieceCount() {
		Piece result;
		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < colLength; j++) {
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
		Piece result;
		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < colLength; j++) {
				result = chessBoard.get(i).boardPieceRow.get(j);
				if (result.isWhite())
					numOfWhitePiece++;
			}
		}
		return numOfWhitePiece;
	}
	
	int countBlackPiece() {
		Piece result;
		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < colLength; j++) {
				result = chessBoard.get(i).boardPieceRow.get(j);
				if (result.isBlack())
					numOfBlackPiece++;
			}
		}
		return numOfBlackPiece;
	}
	
	int numOfPieceByEqualPiece(Piece piece) {
		int count = 0;
		Piece otherPiece;
		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < colLength; j++) {
				otherPiece = chessBoard.get(i).boardPieceRow.get(j);
				if ((piece.getType() == otherPiece.getType()) && (piece.getColor() == otherPiece.getColor()))
					count++;
			}
		}
		
		return count;
	}
	
	Piece getPieceByXY(String string) {
		String indexX = "abcdefgh";
		String indexY = "12345678";
		
		char X = string.charAt(0);
		char Y = string.charAt(1);
		X = Character.toLowerCase(X);
		
		int XPos = indexX.indexOf(X);
		int YPos = 0;
		
		if (XPos < 0)
			return Piece.noPiece();
		else {
			YPos = indexY.indexOf(Y);
			return chessBoard.get(YPos).boardPieceRow.get(XPos);
		}
	}
}
