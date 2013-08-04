package chess;
import static util.StringUtil.NEWLINE;

import java.util.ArrayList;

import pieces.Piece;
import pieces.Piece.PieceType;

public class Board {
	public static final int rowLength = 8;
	public static final int colLength = 8;
	
	int numOfWhitePiece;
	int numOfBlackPiece;
	
	ArrayList<BoardRow> chessBoard;
	double blackValue;
	double whiteValue;

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
		// 말을 다 배치했을 경우
//		chessBoard.get(0).rowAddBlackPieces();
//		chessBoard.get(1).rowAddBlackPawn();
//		for (int i = 0; i < 6; i++) {
//			chessBoard.get(i).rowAddBlank();
//		}
//		chessBoard.get(6).rowAddWhitePawn();
//		chessBoard.get(7).rowAddWhitePieces();

		// 공백 초기화
		for (int i = 0; i < colLength; i++) {
			chessBoard.get(i).rowAddBlank();
		}
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
		int YPos = indexY.indexOf(Y);
		
		if (XPos < 0 || YPos < 0)
			return Piece.noPiece();
		else {
			return chessBoard.get(YPos).boardPieceRow.get(XPos);
		}
	}
	
	void addPieceByXY(String string, Piece piece) {
		String indexX = "abcdefgh";
		String indexY = "12345678";
		
		char X = string.charAt(0);
		char Y = string.charAt(1);
		X = Character.toLowerCase(X);
		
		int XPos = indexX.indexOf(X);
		int YPos = indexY.indexOf(Y);
		
		if (XPos >= 0 && YPos >= 0) {
			chessBoard.get(YPos).boardPieceRow.remove(XPos);
			chessBoard.get(YPos).boardPieceRow.add(XPos, piece);
		}
	}
	
	//dictionary를 만들어서 Key를 숫자로, Value를 Piece로 잡고 각 Key가 가지고 있는 element 숫자만큼 Key값에 곱해서 리턴
	//같은 줄에 있는 Pawn이 발견되면 0.5 -> 1.0 Key쪽으로 옮긴다.
	//하지만 dictionary에서 같은 키에 여러 값을 매핑하는 좋은 방법이 떠오르지 않는다.
	//점수만 뽑아내는 것으로 방향 수정
	void getTotalValue(){
		blackValue = 0;
		whiteValue = 0;
		findSameLinePawn();
		SumTotalValue();
	}
	
	private void SumTotalValue() {
		Piece present;
		for(int i = 0; i < rowLength; i++) {
			for (int j = 0; j < colLength; j++) {
				present = chessBoard.get(i).boardPieceRow.get(j);
				if (present.isBlack())
					blackValue += present.getValue();
				else if (present.isWhite())
					whiteValue += present.getValue();
			}
		}
	}
	
	@SuppressWarnings("null")
	private void findSameLinePawn() {
		Piece present;
		Piece firstPawn = null;
		Piece lastPawn = null;
		for(int i = 0; i < rowLength; i++) {
			for(int j = 0; j < colLength; j++) {
				present = chessBoard.get(i).boardPieceRow.get(j);
				if (present.getType() == PieceType.PAWN_REPRESENTATION) {
					if(firstPawn == null) { 
						firstPawn = present;
					}
					else {
						present.setValue(1.0);
						lastPawn = present;
					}
				}
			}
			if(lastPawn != null) {
				firstPawn.setValue(1.0);
			}
			firstPawn = null;
			lastPawn = null;
		}
	}
	
	double getBlackValue() {
		return blackValue;
	}
	
	double getWhiteValue() {
		return whiteValue;
	}
}
