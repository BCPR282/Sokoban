package MapDesigner;

public class Map implements IMap {

	Cell[][] allCells;
	String name;
	int height;
	int width;
	
	
	public Map(String name)
	{
		this.name = name;
	}
	
	public Map(String name, int width, int height)
	{
		this.name = name;
		this.width = width;
		this.height = height;
		allCells = new Cell[width][height];
	}
	
	@Override
	public void setCell(int xLoc, int yLoc, ECell cell) {
		setCell(xLoc, yLoc, cell.symbol);
	}
	
	@Override
	public void fromString(String mapString)
	{
		String[] lines = mapString.split("\\|");
		allCells = setMapSize(lines.length,lines[0].length());
		
		for(int x = 0; x < lines.length; x++)
		{
			for(int y = 0; y < lines[x].length(); y++ )
			{
				setCell(x, y, lines[x].charAt(y));
			}
		}
	}
	

	@Override
	public String toString() {
		String string = "";
		for(Cell[] y : allCells){
			for(Cell x : y) {
				string += x.getChar();
			}
			string += "|";
		}
		
		return string.substring(0, string.length()-1);
	}


	@Override
	public Cell[][] setMapSize(int width, int height) {
		return new Cell[width][height];
	}

	@Override
	public void setCell(int xLoc, int yLoc, char cell) {
		String chars = "@#$-+*.";
		if(!(chars.indexOf(cell) == -1))
		{
			allCells[xLoc][yLoc] = new Cell(cell);
		} else {
			System.out.println("Symbol is not allowed. Please select a correct symbol");
		}
		
		
	}
	
	public char getCellAt(int x, int y) {
		if(allCells.length > (x * y)) {
			return allCells[x][y].getChar();
		} else {
			System.out.println("Cell does not exist. Please enter a correct location");
			return ' ';
		}
	}

}
