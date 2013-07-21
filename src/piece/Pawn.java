package piece;
public class Pawn {

	String color;
	char pawnType;

	public static final String W = "White";
	public static final String B = "Black";
	
	String getColor() {
		return color;
	}

	public Pawn(String color) {
		this.color = color;
		if (color == B)
			pawnType = 'P';
		else
			pawnType = 'p';
	}
	
	public Pawn() {
		this.color = W;
		pawnType = 'p';
	}
}
