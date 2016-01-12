/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program 2
 */
package program2;

public class Stack
{
	private int stackSize;
	private char [] stackArray;
	private int top;

	public Stack(int size)
	{
		this.stackSize = size;
		this.stackArray = new char[stackSize];
		this.top = -1;
	}
	
	public void push(char entry)
	{
		if(this.isFull())
		{
			System.out.println(("Stack is full."));
		}
		this.stackArray[++top]= entry;
	}
	
	public char pop() throws Exception
	{
		if(this.isEmpty())
		{
			throw new Exception("Stack is empty.");
		}
		char entry = this.stackArray[top--];
		return entry;
	}
	
	public char peek()
	{
		return stackArray[top];
	}
	
	public boolean isEmpty()
	{
		return(top == -1);
	}
	
	public boolean isFull()
	{
		return (top == stackSize-1);
	}
	

}
