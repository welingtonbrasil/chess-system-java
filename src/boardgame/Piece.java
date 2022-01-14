package boardgame;

public class Piece {

	private Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	public Board getBoard() {
		return board;
	}
	
	
	
	
}
