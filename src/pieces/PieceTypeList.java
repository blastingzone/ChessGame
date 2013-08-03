package pieces;

enum PieceTypeList {
	PAWN('p'), KNIGHT('n'), ROOK('r'), BISHOP('b'), QUEEN('q'), KING('k');
	
	char name;
	
	PieceTypeList(char name) {
		this.name = name;
	}
	
	char getName() {
		return name;
	}
}