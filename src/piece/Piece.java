package piece;
public class Piece {

	public static final String W = "White";
	public static final String B = "Black";
	
	public static final String PAWN = "pawn";
	public static final String KNIGHT = "knight";
	public static final String ROOK = "rook";
	public static final String BISHOP = "bishop";
	public static final String QUEEN = "queen";
	public static final String KING = "king";
	
	String color;
	char pieceTypeByColor;
	String name;

	private Piece(String name, String color) {
		this.name = name;
		this.color = color;
		colorCheck(color);
	}
	
	public String getColor() {
		return color;
	}
	
	//이름을 체크하는 기능이 필요할 것이다.
	//1) 중복인지 2) 체스에 없는 이름인지
	public static Piece create(String name, String color) {
		return new Piece(name,color);
	}
	
	public void setColor(String color) {
		this.color = color;
		colorCheck(color);
	}
	
	public char getType() {
		return pieceTypeByColor;
	}
	
	private void colorCheck(String color) {
		if (color == B)
			pieceTypeByColor = 'P';
		else if (color == W)
			pieceTypeByColor = 'p';
		else
			pieceTypeByColor = '.';
	}
}
