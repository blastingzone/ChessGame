public class Pawn {

	String color;

	final String W = "White";
	final String B = "Black";
	
	String getColor() {
		return color;
	}

	Pawn(String color) {
		this.color = color;
	}
	
	Pawn() {
		this.color = "White";
	}
}
