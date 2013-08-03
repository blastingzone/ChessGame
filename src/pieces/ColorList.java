package pieces;

enum ColorList {
	B("Black"), W("White");
	
	private String color;
	
	ColorList(String string) {
		color = string;
	}
	
	String getColor() {
		return color;
	}
}
