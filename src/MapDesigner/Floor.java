package MapDesigner;

public class Floor extends Cell implements IFloor {
	
	final char SYMBOL = '-';
	
	public Floor()
	{
	}
	
	@Override
	public char getChar()
	{
		return SYMBOL;
	}
}
