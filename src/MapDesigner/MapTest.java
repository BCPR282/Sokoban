package MapDesigner;

import static org.junit.Assert.*;

import org.junit.Test;

public class MapTest {

	
	@Test
	public void testMapConstructer() {
		Map map1 = new Map();
		assertNotNull(map1);
	}
	
	@Test
	public void testMapConstructerInt() {
		Map map1 = new Map(2,3);
		assertEquals(2, map1.allCells.length);
		assertEquals(3, map1.allCells[0].length);
	}
	
	@Test
	public void testFromString() {
		Map map1 = new Map();
		map1.fromString("---|###|...|@@@|$$$|***|+++");
		assertEquals(7, map1.allCells.length);
		assertEquals(3, map1.allCells[1].length);
		assertEquals('-', map1.allCells[0][1].getChar());
		assertEquals('#', map1.allCells[1][1].getChar());
		assertEquals('.', map1.allCells[2][1].getChar());
		assertEquals('@', map1.allCells[3][1].getChar());
		assertEquals('$', map1.allCells[4][1].getChar());
		assertEquals('*', map1.allCells[5][1].getChar());
		assertEquals('+', map1.allCells[6][1].getChar());
	}
	
	@Test
	public void testToString() {
		Map map1 = new Map();
		map1.fromString("---|###|...|@@@|$$$|***|+++");
		assertEquals("---|###|...|@@@|$$$|***|+++", map1.toString());
	}
	
	@Test
	public void testCreateMapSize() {
		Map map1 = new Map(3,3);
		map1.allCells = map1.createMapSize(11, 15);
		assertEquals(11, map1.allCells.length);
		assertEquals(15, map1.allCells[0].length);
	}
	
	@Test
	public void testSetCell() {
		Map map1 = new Map();
		map1.fromString("---|###|...|@@@|$$$|***|+++");
		
		map1.setCell(0, 1, '$');
		assertEquals('$', map1.allCells[0][1].getChar());
		
		map1.setCell(0, 1, '-');
		assertEquals('-', map1.allCells[0][1].getChar());
		
		map1.setCell(0, 1, '@');
		assertEquals('@', map1.allCells[0][1].getChar());
		
		map1.setCell(0, 1, '#');
		assertEquals('#', map1.allCells[0][1].getChar());
		
		map1.setCell(0, 1, '+');
		assertEquals('+', map1.allCells[0][1].getChar());
		
		map1.setCell(0, 1, '*');
		assertEquals('*', map1.allCells[0][1].getChar());
		
		map1.setCell(0, 1, '.');
		assertEquals('.', map1.allCells[0][1].getChar());
	}
	
	
	@Test
	public void testSetCellEnum() {
		Map map1 = new Map();
		map1.fromString("---|###|...|@@@|$$$|***|+++");
		
		map1.setCell(0, 1, ECell.WALL);
		assertEquals('#', map1.allCells[0][1].getChar());
		
		map1.setCell(0, 1, ECell.PLAYER);
		assertEquals('@', map1.allCells[0][1].getChar());
		
		map1.setCell(0, 1, ECell.PLAYERTARGET);
		assertEquals('+', map1.allCells[0][1].getChar());
		
		map1.setCell(0, 1, ECell.CRATE);
		assertEquals('$', map1.allCells[0][1].getChar());
		
		map1.setCell(0, 1, ECell.CRATETARGET);
		assertEquals('*', map1.allCells[0][1].getChar());
		
		map1.setCell(0, 1, ECell.TARGET);
		assertEquals('.', map1.allCells[0][1].getChar());
		
		map1.setCell(0, 1, ECell.FLOOR);
		assertEquals('-', map1.allCells[0][1].getChar());
	}
	
	@Test
	public void testCheckMap() {
		Map map1 = new Map(3,3);
		//Check map should fail as incorrect numbers of players
		map1.fromString("---|###|...|@@@|$$$|***|+++");
		assertEquals(false, map1.checkMap());
		
		//Check map should pass 
		map1.fromString("---|###|...|@##|$$$|***");
		assertEquals(true, map1.checkMap());
		
		//Check map should pass working map
		map1.fromString("###|#.#|#$#|#@#|###");
		assertEquals(true, map1.checkMap());
	}
	
	
	

}
