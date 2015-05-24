package MapDesigner;

import static org.junit.Assert.*;

import org.junit.Test;

public class LevelCreatorTest {
	

	@Test
	public void testLevelCreatorContructer() {
		LevelCreator lvlCreator = new LevelCreator();
		assertNotNull(lvlCreator.currentLevel);
	}
	
	@Test
	public void testLevelCreatorNewMap() {
		LevelCreator lvlCreator = new LevelCreator();
		lvlCreator.currentLevel = lvlCreator.newMap(5, 5);
		assertEquals(5, lvlCreator.currentLevel.allCells.length);
		assertEquals(5, lvlCreator.currentLevel.allCells[0].length);
	}
	
	@Test
	public void testLevelCreatorPlaceCellChar() {
		LevelCreator lvlCreator = new LevelCreator();
		lvlCreator.currentLevel = lvlCreator.newMap(5, 5);
		lvlCreator.placeCell(0, 0, '$');
		assertEquals('$', lvlCreator.currentLevel.allCells[0][0].symbol);
	}
	
	@Test
	public void testLevelCreatorPlaceCellCell() {
		LevelCreator lvlCreator = new LevelCreator();
		lvlCreator.currentLevel = lvlCreator.newMap(5, 5);
		lvlCreator.placeCell(0, 0, new Cell('$'));
		assertEquals('$', lvlCreator.currentLevel.allCells[0][0].symbol);
	}

}
