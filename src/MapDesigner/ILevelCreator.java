package MapDesigner;

public interface ILevelCreator {
	void placeCell(int xLoc, int yLoc, ICell cell);
	IMap newMap(int width, int height);
}
