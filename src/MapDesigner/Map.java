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
		String[] lines = mapString.split("|");
		allCells = setMapSize(lines[0].length(), lines.length);
		
		for(int y = 0; y < lines.length; y++)
		{
			for(int x = 0; x < lines[y].length(); x++ )
			{
				setCell(x, y, lines[y].charAt(x) );
			}
		}
	}
	

	@Override
	public String toString() {
		String string = "";
		for(Cell[] y : allCells){
			for(Cell x : y) {
				string += x.toString();
			}
			string += '|';
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
