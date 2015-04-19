package MapDesigner;

public interface ILevelCreator {
	int getCursorY();
	int getCursorX();
	void placeCell(int xLoc, int yLoc, ICell cell);
	IMap newMap();
}
