package MapDesigner;

public interface ILevelCreator {
	void placeCell(int xLoc, int yLoc, char cell);
	void newMap(String name, int width, int height);
	void newMap(String name, String fromString);
	String saveMap();
}
