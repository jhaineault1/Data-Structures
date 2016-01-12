/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program-4
 */

package program4;

import java.util.HashMap;

public class Graph {

	private HashMap<Character, Node> nodes = new HashMap<>();
	
	public Graph()
	{
		
	}
	
	public Graph(HashMap nodes)
	{
		this.nodes = nodes;
	}
	
	public Node getNode(char a)
	{
		Node n = null;
		if(!this.nodes.containsKey(a))
		{
			System.out.println("Node does not exist.");
		
			return n;
		}
		return this.nodes.get(a);
	}
	public void addNode(Node a)
	{
		if(this.nodes.containsValue(a))
		{
			System.out.println("Node exists. Nothing to add.");
		
			return;
		}
		this.nodes.put(a.getData(), a);
		System.out.println("Node added successfully " + a.getData());
	}
	
	public void removeNode(Node a)
	{
		if(this.nodes.containsValue(a.getData()))
		{
			System.out.println("Node does not exists. Nothing to remove.");
		
			return;
		}
		this.nodes.remove(a.getData());
		System.out.println("Node removed successfully " + a.getData());
	}
}
