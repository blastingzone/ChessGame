package piece;
public class Piece {

	public static final String W = "White";
	public static final String B = "Black";
	
	public static final char PAWN = 'p';
	public static final char KNIGHT = 'n';
	public static final char ROOK = 'r';
	public static final char BISHOP = 'b';
	public static final char QUEEN = 'q';
	public static final char KING = 'k';
	
	String color;
	char name;

	private Piece(char name, String color) {
		this.name = name;
		this.color = color;
		colorCheck(color);
	}
	
	public String getColor() {
		return color;
	}
	
	//이름을 체크하는 기능이 필요할 것이다.
	//1) 중복인지 2) 체스에 없는 이름인지
	public static Piece create(char name, String color) {
		return new Piece(name,color);
	}
	
	//이 메소드도 클래스 속성을 바꿀 수 있으므로 삭제해야
	public void setColor(String color) {
		this.color = color;
		colorCheck(color);
	}
	
	//pieceTypeByColor 변수를 쓰지 않고 name과 color만으로도 구현할 수 있지 않을까?
	public char getName() {
		return name;
	}
	
	private void colorCheck(String color) {
		if (color == B)
			name = Character.toUpperCase(name);
		else if (color == W)
			return;
		else
			name = '.';
	}
}
