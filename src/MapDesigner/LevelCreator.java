package MapDesigner;

public class LevelCreator implements ILevelCreator {
	
	Map currentMap;
	
	public LevelCreator()
	{
		
	}

	@Override
	public void placeCell(int xLoc, int yLoc, ICell cell) {
		// TODO Auto-generated method stub

	}

	@Override
	public IMap newMap(int width, int height) {
		// TODO Auto-generated method stub
		return new Map(width, height);
	}

}
