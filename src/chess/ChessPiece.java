package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;

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

	//getters setters
	public Color getColor() {
		return color;
	}	
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position); 
	}
}
