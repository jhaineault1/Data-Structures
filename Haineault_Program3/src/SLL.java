/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program-3
 */

public class SLL {
	
	public Node front;
	public Node rear;
	public int size;
	
	public SLL()
	{
		this.front = null;
		this.rear = null;
		this.size = 0;
	}
	
	public int size()
	{
		return this.size;
	}
	
	
	public void add(int data)
	{
		Node node = new Node(data, null);
		
		if (this.front == null) {
			this.front = node;
			this.rear = node;
		} else {
			this.rear.setNext(node);
			this.rear = node;
		}
		
		this.size++;
	}
	
	public void delete()
	{
		Node node = null;
		
		if(this.front == null) 
			return;
		else{
			if(this.front == this.rear){
				this.front = null;
				this.rear = null;
			} else {
				this.front = front.next;
			}
			this.size--;
		}
	}
	
	public String lastNode()
	{	
		return (this.rear == null) ? "There are no numbers in the queue!" : this.rear.toString();
	}
	
	public String peek()
	{
		return (this.front == null) ? "There are no numbers in the queue!" : this.front.toString();
	}
	
	public void displayItems()
	{
		if(this.front == null) {
			System.out.println("There are no numbers in the queue!");
			return;
		}
		
		Node iterator = this.front;
		String result = "";
		
		while(iterator != null)
		{
			result += (iterator == this.rear) ? iterator.toString() : iterator.toString() + ", ";
			iterator = iterator.next();
		}
		
		System.out.println(result);
	}
	
}

