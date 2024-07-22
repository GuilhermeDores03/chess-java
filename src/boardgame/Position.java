package boardgame;

public class Position {

	private int row;
	private int column;
	
	//constructor
	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	//methods	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	//getter setters
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}	
}
