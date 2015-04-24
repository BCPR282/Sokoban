package MapDesigner;

public interface IMap {
	void setCell(int xLoc, int yLoc, ECell cell);
	void setCell(int xLoc, int yLoc, char cell);
	String toString(); 
	void fromString(String mapString);
	Cell[][] setMapSize(int width, int height);
}
