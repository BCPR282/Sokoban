package MapDesigner;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestLevelCreator {

	LevelCreator levelCreator;
	
	@Before
	public void setUp() throws Exception {
		levelCreator = new LevelCreator();
		levelCreator.newMap("Test", 5, 5);
	}

	@After
	public void tearDown() throws Exception {
		levelCreator = null;
	}

	@Test
	public void testPlaceCell() {
		levelCreator.placeCell(1, 1, '@');
		assertEquals(levelCreator.currentMap.getCellAt(1, 1), '@');
	}

	
	
	@Test
	public void testNewMapStringValues() {
		Map map = new Map("Test");
		map.fromString("##|##");
		levelCreator.newMap("Test", "##|##");
		assertEquals(map.getCellAt(1, 1), levelCreator.currentMap.getCellAt(1, 1));
	}
	
	@Test
	public void testSaveMap() {
		levelCreator.newMap("Test", "##|##");
		assertEquals("##|##", levelCreator.saveMap());
		
	}

}
