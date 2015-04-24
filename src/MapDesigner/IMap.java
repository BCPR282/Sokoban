package MapDesigner;

public interface IMap {
	void setCell(int xLoc, int yLoc, ICell cell);
	String toString(IMap map); 
	void fromString(String mapString);
	Boolean checkMap();
}
