package MapDesigner;

public class Map implements IMap {

	Cell[][] allCells;
	
	public Map()
	{
		//do NOTHING!!!
	}
	
	public Map(int width, int height)
	{
		allCells = new Cell[width][height];
	}
	
	@Override
	public void setCell(int xLoc, int yLoc, ECell cell) {
		allCells[xLoc][yLoc] = new Cell(cell);
	}
	
	@Override
	public void fromString(String mapString)
	{
		String[] lines = mapString.split("\\|");
		allCells = setMapSize(lines.length,lines[0].length());
		
		for(int x = 0; x < lines.length; x++)
		{
			System.out.println(x);
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
		allCells[xLoc][yLoc] = new Cell(cell);
		
	}

}
