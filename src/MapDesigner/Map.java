package MapDesigner;

public class Map implements IMap {
	
	Cell[][] allCells;
	
	public Map()
	{
		
	}
	
	public Map(int xSize, int ySize)
	{
		if ((xSize>0)&&(xSize<1000)&&(ySize>0)&&(ySize<1000))
		{
			allCells = new Cell[xSize][ySize];
		}
		else
		{
			System.out.println("Your size is out of bounds sizes between 0-1000 please");
		}
	}

	@Override
	public String toString() {
		try{
			String mapString = "";
			for (int x = 0; x<allCells.length; x++)
			{
				for (int y = 0; y<allCells[x].length; y++)
				{
					mapString += allCells[x][y].getChar();
				}
				mapString += "|";
			}
			return mapString.substring(0, mapString.length() - 1);
		} catch (NullPointerException nfe) {
			System.out.println("No map size currently implemented");
			return "0";
		}
		
	}

	@Override
	public void fromString(String mapString) {
		
		String[] mapSplit = mapString.split("\\|");
		allCells = createMapSize(mapSplit.length, mapSplit[0].length());
		
		for (int x = 0; x<mapSplit.length; x++)
		{
			for (int y = 0; y<mapSplit[x].length(); y++)
			{
				setCell(x, y, mapSplit[x].charAt(y));
			}
		}
	}

	@Override
	public Boolean checkMap() {
		try {
			int player = 0;
			int crates = 0;
			int targets = 0;
			
			for (int x = 0; x<allCells.length; x++)
			{
				for (int y = 0; y<allCells[x].length; y++)
				{
					if (allCells[x][y].getChar() == '@' || allCells[x][y].getChar() == '+')
					{
						player += 1;
					}
					
					if (allCells[x][y].getChar() == '$' || allCells[x][y].getChar() == '*')
					{
						crates += 1;
					}
					
					if (allCells[x][y].getChar() == '*' || allCells[x][y].getChar() == '.')
					{
						targets += 1;
					}
				}
			}
			
			if (player != 1)
			{
				return false;
			}
			else if (crates != targets)
			{
				return false;
			}
			else
			{
				return true;
			}
		}	catch (NullPointerException nfe) {
				System.out.println("No map size currently implemented");
				return false;
		}
	}
	
	@Override
	public Cell[][] createMapSize (int xSize, int ySize) {
		if ((xSize>0)&&(xSize<1000)&&(ySize>0)&&(ySize<1000))
		{
			return new Cell[xSize][ySize];
		}
		else
		{
			System.out.println("Your size is out of bounds sizes between 0-1000 please");
			return new Cell[5][5];
		}
		
	}

	@Override
	public void setCell(int xLoc, int yLoc, ECell cell) {
		try {
			allCells[xLoc][yLoc] = new Cell(cell);	
		} catch (NullPointerException nfe) {
			System.out.println("No map size currently implemented");
		}
	}

	@Override
	public void setCell(int xLoc, int yLoc, char cell) {
		try {
			allCells[xLoc][yLoc] = new Cell(cell);	
		} catch (NullPointerException nfe) {
			System.out.println("No map size currently implemented");
		}
	}


}
