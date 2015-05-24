package MapDesigner;

public class LevelCreator implements ILevelCreator {
	
	Map currentLevel;

	public LevelCreator()
	{
		currentLevel = new Map();
	}
	
	public void placeCell(int xLoc, int yLoc, Cell cell) {
		if ((xLoc >= 0) && (xLoc < (currentLevel.allCells.length -1)) && (yLoc >= 0) && 
				(yLoc < (currentLevel.allCells[0].length - 1)))
		{
			try{
				currentLevel.allCells[xLoc][yLoc] = cell;
			} catch (NullPointerException nfe) {
				System.out.println("No map size currently implemented");
			}
		}
		else
		{
			System.out.println("Coordinate out of range");
		}
	}
	
	public void placeCell(int xLoc, int yLoc, char cell) {
		if ((xLoc>=0)&&(xLoc<(currentLevel.allCells.length-1))&&(yLoc>=0)&& 
				(yLoc < (currentLevel.allCells[0].length - 1)))
		{
			try{
				currentLevel.allCells[xLoc][yLoc] = new Cell(cell);
			} catch (NullPointerException nfe) {
				System.out.println("No map size currently implemented");
			}
		}
		else
		{
			System.out.println("Coordinate out of range");
		}
		
	}

	@Override
	public Map newMap(int width, int height) {
		if ((width>0)&&(width<1000)&&(height>0)&&(height<1000))
		{
			return new Map(width, height);
		}
		else 
		{
			System.out.println("Your size is out of bounds sizes between 0-1000 please");
			return new Map(5, 5);
		}
		
	}

}
