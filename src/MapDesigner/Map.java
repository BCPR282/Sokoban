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
	public void setCell(int xLoc, int yLoc, ICell cell) {
		allCells[xLoc][yLoc] = (Cell)cell;
	}
	
	@Override
	public void fromString(String mapString)
	{
		for(String symbol : mapString.split(","))
		{
			//add stuff here
		}
	}
	

	@Override
	public String toString(IMap map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean checkMap() {
		// TODO Auto-generated method stub
		return null;
	}

}
