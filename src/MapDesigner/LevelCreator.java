package MapDesigner;

public class LevelCreator implements ILevelCreator {
	
	Map currentMap;
	
	public LevelCreator()
	{
		
	}

	@Override
	public void placeCell(int xLoc, int yLoc, char cell) {
		currentMap.setCell(xLoc, yLoc, cell);

	}

	@Override
	public void newMap(String name, int width, int height) {
		this.currentMap = new Map(name, width, height);
	}
	
	public void newMap(String name, String fromString) {
		Map map = new Map(name);
		map.fromString(fromString);
		
		this.currentMap = map;
	}

	@Override
	public String saveMap() {
		
		return this.currentMap.toString();
	}


}
