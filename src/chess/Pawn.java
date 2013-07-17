package chess;
public class Pawn {

	String color;

	static final String W = "White";
	static final String B = "Black";
	
	String getColor() {
		return color;
	}

	Pawn(String color) {
		this.color = color;
	}
	
	Pawn() {
		this.color = W;
	}
}
