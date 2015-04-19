package MapDesigner;

public interface IMap {
	void setCell(int xLoc, int yLoc, ICell cell);
	void iMap(int xSize, int ySize);
	String toString(IMap map); 
	void fromString(String mapString);
	Boolean checkMap();
}
