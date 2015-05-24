package MapDesigner;

public enum ECell {
	FLOOR('-'), PLAYER('@'), TARGET('.'), WALL('#'), CRATE('$'), PLAYERTARGET('+'), CRATETARGET('*') ;
	public final char symbol;
	
	ECell(char symbol) {
		this.symbol = symbol;
	}
}


