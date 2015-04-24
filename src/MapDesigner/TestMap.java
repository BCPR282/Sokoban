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
		map = new Map(5, 5);
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
	public void testSetCellEnum(){
		map.setCell(1, 1, ECell.CRATE);
		assertEquals('$', map.allCells[1][1].getChar());
	}
	
	@Test
	public void testSetCellChar(){
		map.setCell(2, 2, '-');
		assertEquals('-', map.allCells[2][2].getChar());
	}
	
	@Test
	public void testFromString(){
		assertEquals('@', map.allCells[2][1].getChar());
		assertEquals('.', map.allCells[3][1].getChar());
		assertEquals('#', map.allCells[0][2].getChar());
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
