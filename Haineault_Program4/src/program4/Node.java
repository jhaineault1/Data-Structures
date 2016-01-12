/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program-4
 */

package program4;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Node {

	private HashMap<Character, Node> nodes = new HashMap<>();
	private char data;
	
	public Node()
	{
		
	}
	
	public Node(char data)
	{
		this.data = data;
	}
	
	public int getDegree()
	{
		int n = this.nodes.size();
		System.out.println("Degree is " + n);
		return n;
	}
	
	public char getData()
	{
		return this.data;
	}
	
	public void display()
	{
		for(Node c : this.nodes.values())
		{
			System.out.println(c.getData());
		}
	}
	
	public void removeEdge(Node a)
	{
		if(!this.nodes.containsValue(a))
		{
			System.out.println("Edge does not exists between these nodes. Nothing to remove.");
		
			return;
		}
		this.nodes.remove(a.getData());
		System.out.println("Edge removed successfully " + a.getData());
	}
	
	public void addEdge(Node a) 
	{
		if(this.nodes.containsValue(a))
		{
			System.out.println("Edge exists between these nodes. Nothing to add.");
		
			return;
		}
		this.nodes.put(a.getData(), a);
		System.out.println("Edge added successfully " + a.getData());
	}	
}
