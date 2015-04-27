package MapDesigner;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCells {
	Cell cell;

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		cell = null;
	}

	@Test
	public void testCellChar() {
		cell = new Cell('@');
		assertEquals(cell.getChar(), '@');
	}

	@Test
	public void testCellECell() {
		cell = new Cell(ECell.WALL);
		assertEquals(cell.getChar(), '#');
	}

	@Test
	public void testGetChar() {
		cell = new Cell('@');
		assertEquals(cell.getChar(), '@');
	}

}
