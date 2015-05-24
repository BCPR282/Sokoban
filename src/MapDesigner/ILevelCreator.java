package MapDesigner;

public interface ILevelCreator {
	void placeCell(int xLoc, int yLoc, Cell cell);
	void placeCell(int xLoc, int yLoc, char cell);
	Map newMap(int width, int height);
}
