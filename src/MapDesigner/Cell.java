package MapDesigner;

public class Cell implements ICell {

	char symbol;
	
	public Cell(char symbol) {
		this.symbol = symbol;
	}
	
	public Cell(ECell cell){
		this.symbol = cell.symbol;
	}

	@Override
	public char getChar() {
		return symbol;
	}
	
}
