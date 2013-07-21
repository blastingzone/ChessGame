package piece;
public class Pawn {

	String color;
	char pawnType;

	public static final String W = "White";
	public static final String B = "Black";
	
	public String getColor() {
		return color;
	}

	public Pawn(String color) {
		this.color = color;
		colorCheck(color);
	}
	
	public Pawn() {
		this.color = W;
		pawnType = 'p';
	}
	
	public void setColor(String color) {
		this.color = color;
		colorCheck(color);
	}
	
	public char getType() {
		return pawnType;
	}
	
	private void colorCheck(String color) {
		if (color == B)
			pawnType = 'P';
		else if (color == W)
			pawnType = 'p';
		else
			pawnType = '.';
	}
}
