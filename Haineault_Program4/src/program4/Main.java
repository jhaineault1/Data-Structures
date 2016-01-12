/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program-4
 */

package program4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		boolean quit = false;
		Node a = new Node('A');
		Node b = new Node('B');
		Node c = new Node('C');
		Node d = new Node('D');
		Node e = new Node('E');
		Node f = new Node('F');
		Node g = new Node('G');
		
		a.addEdge(b);
		a.addEdge(c);
		a.addEdge(g);
		a.addEdge(e);
		a.addEdge(f);
		
		b.addEdge(a);
		b.addEdge(c);
		
		c.addEdge(a);
		c.addEdge(b);
		c.addEdge(d);
		c.addEdge(e);
		c.addEdge(f);
		
		d.addEdge(c);
		d.addEdge(e);
		d.addEdge(g);
		
		e.addEdge(a);
		e.addEdge(c);
		e.addEdge(d);
		e.addEdge(f);
		e.addEdge(g);
		
		f.addEdge(a);
		f.addEdge(c);
		f.addEdge(e);
		
		g.addEdge(a);
		g.addEdge(e);
		g.addEdge(d);
		
		Graph graph = new Graph();
		
		graph.addNode(a);
		graph.addNode(b);
		graph.addNode(c);
		graph.addNode(d);
		graph.addNode(e);
		graph.addNode(f);
		graph.addNode(g);
		
		a.display();
		System.out.println(a.getDegree());
		do {
			switch(Main.getMenuOption(scan)){
			
			case 1:
				System.out.println("Enter a Node: ");
				String n = scan.next();
				Node n1 = graph.getNode(n.charAt(0));
				n1.getDegree();
				break;
				
			case 2:
				System.out.println("Enter a Node: ");
				String s2 = scan.next();
				Node n2 = graph.getNode(s2.charAt(0));
				n2.display();
				break;
				
			case 3:
				System.out.println("Enter 1st Node: ");
				String s3 = scan.next();
				Node n3 = graph.getNode(s3.charAt(0));
				System.out.println("Enter 2nd Node: ");
				String s4 = scan.next();
				Node n4 = graph.getNode(s4.charAt(0));
				n3.removeEdge(n4);
				break;
				
			case 4:
				System.out.println("Enter 1st Node: ");
				String s5 = scan.next();
				Node n5 = graph.getNode(s5.charAt(0));
				System.out.println("Enter 2nd Node: ");
				String s6 = scan.next();
				Node n6 = graph.getNode(s6.charAt(0));
				n5.addEdge(n6);
				break;
			
			case 5:
				quit = true;
				System.out.println("Have a good day");
			}
		}while(!quit);
		
	}
	
		private static int getMenuOption(Scanner s)
		{
			System.out.println("1. Display degree of chosen node.\n"
							 + "2. Display list of nodes adjacent to chosen node.\n"
							 + "3. Drop an edge between a chosen pair of nodes.\n"
							 + "4. Add an edge between a chosen pair of nodes.\n"
							 + "5. Quit.\n"
							 + "Choose an option and press Enter:\t");
			return s.nextInt();
			
		}
}
