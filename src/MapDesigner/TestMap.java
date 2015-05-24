package MapDesigner;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class TestMap {
	Map map;
	@Before
	public void setup()
	{
		map = new Map("Test");
		map.fromString("###|#-#|#@#|#.#|###");
	}
	
	@After
	public void teardown()
	{
		map = null;
	}

	@Test
	public void testConstruct() {
		assertNotNull(map.allCells);
	}
	
	@Test
	public void testSetCellEnumCrate(){
		map.setCell(1, 1, ECell.CRATE);
		assertEquals('$', map.allCells[1][1].getChar());
	}
	
	@Test
	public void testSetCellEnumCrateTarget(){
		map.setCell(1, 1, ECell.CRATETARGET);
		assertEquals('*', map.allCells[1][1].getChar());
	}
	
	@Test
	public void testSetCellEnumFloor(){
		map.setCell(1, 1, ECell.FLOOR);
		assertEquals('-', map.allCells[1][1].getChar());
	}
	
	@Test
	public void testSetCellEnumPlayer(){
		map.setCell(1, 1, ECell.PLAYER);
		assertEquals('@', map.allCells[1][1].getChar());
	}
	
	@Test
	public void testSetCellEnumPlayerTarget(){
		map.setCell(1, 1, ECell.PLAYERTARGET);
		assertEquals('+', map.allCells[1][1].getChar());
	}
	
	@Test
	public void testSetCellEnumTarget(){
		map.setCell(1, 1, ECell.TARGET);
		assertEquals('.', map.allCells[1][1].getChar());
	}
	
	@Test
	public void testSetCellEnumWall(){
		map.setCell(1, 1, ECell.WALL);
		assertEquals('#', map.allCells[1][1].getChar());
	}
	
	@Test
	public void testSetCellCharFloor(){
		map.setCell(2, 2, '-');
		assertEquals('-', map.allCells[2][2].getChar());
	}
	
	@Test
	public void testSetCellCharPlayerTarget(){
		map.setCell(2, 2, '+');
		assertEquals('+', map.allCells[2][2].getChar());
	}
	
	@Test
	public void testSetCellCharCrateTarget(){
		map.setCell(2, 2, '*');
		assertEquals('*', map.allCells[2][2].getChar());
	}
	
	@Test
	public void testSetCellCharTarget(){
		map.setCell(2, 2, '.');
		assertEquals('.', map.allCells[2][2].getChar());
	}
	
	@Test
	public void testSetCellCharWall(){
		map.setCell(2, 2, '#');
		assertEquals('#', map.allCells[2][2].getChar());
	}
	
	@Test
	public void testSetCellCharCrate(){
		map.setCell(2, 2, '$');
		assertEquals('$', map.allCells[2][2].getChar());
	}
	
	@Test
	public void testSetCellCharWrong(){
		map.setCell(2, 2, '&');
		assertNotEquals(map.allCells[2][2].getChar(), '&');
	}
	
	@Test
	public void testSetCellCharPlayer(){
		map.setCell(2, 2, '@');
		assertEquals('@', map.allCells[2][2].getChar());
	}
	
	@Test
	public void testFromStringBoth(){
		assertEquals('-', map.allCells[1][1].getChar());

	}
	
	@Test
	public void testFromStringX(){
		assertEquals('#', map.allCells[1][0].getChar());
	}
	
	@Test
	public void testFromStringY(){
		assertEquals('#', map.allCells[0][1].getChar());
	}
	
	@Test
	public void testToString(){
		assertEquals("###|#-#|#@#|#.#|###", (String)map.toString());
	}
	
	@Test
	public void testSetMapSize(){
		map.allCells = map.setMapSize(10, 10);
		assertEquals(new Cell[10][10].length, map.allCells.length);
	}
	
}
