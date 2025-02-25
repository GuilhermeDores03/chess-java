package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	//constructor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	//methods
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}

	//getters setters
	public int getMoveCount() {
		return moveCount;
	}
	
	public Color getColor() {
		return color;
	}	
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position); 
	} 
}
