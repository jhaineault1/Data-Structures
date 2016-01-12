/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program-3
 */

public class Node {
	
	int data;
	Node next = null;
	
	public Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
	
	public Node next()
	{
		return this.next;
	}
	
	public void setNext(Node node)
	{
		this.next = node;
	}
	
	@Override
	public String toString()
	{
		return "" + data;
	}
	
}

