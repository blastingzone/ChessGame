package piece;
public class Pawn {

	String color;

	public static final String W = "White";
	public static final String B = "Black";
	
	String getColor() {
		return color;
	}

	public Pawn(String color) {
		this.color = color;
	}
	
	public Pawn() {
		this.color = W;
	}
}
