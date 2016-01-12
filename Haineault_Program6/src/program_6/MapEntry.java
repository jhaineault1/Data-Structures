package program_6;
/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program 6
 */
public class MapEntry {

	protected int value;
	protected int key;
	
	public MapEntry(int value, int key)
	{
		this.value = value;
		this.key = key;
	}
	public String toString()
	{
		return "" + this.value;
	}
}
