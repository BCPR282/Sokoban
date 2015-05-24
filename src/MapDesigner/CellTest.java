package MapDesigner;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {

	@Test
	public void testCellCharConstructer() {
		Cell cell = new Cell('$');
		assertEquals('$', cell.symbol);
	}
	
	@Test
	public void testCellEnumConstructer() {
		Cell cell = new Cell(ECell.CRATE);
		assertEquals('$', cell.symbol);
	}
	
	@Test
	public void testCellGetChar() {
		Cell cell = new Cell(ECell.CRATE);
		assertEquals('$', cell.getChar());
	}

}
