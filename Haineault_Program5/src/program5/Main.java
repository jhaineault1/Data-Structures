/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program 5
 */

package program5;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) throws Exception {

			Scanner scan = new Scanner(System.in);		
			boolean quit = false;
			
			System.out.println("How many elements do you want to add?");
			int numElements = scan.nextInt();
			int [] elements = new int [numElements];
			
			System.out.println("Enter " + numElements + " numbers: ");
			
			for(int i = 0; i < elements.length; i++)
			{
				System.out.println("Enter number " + (i+1) + ": ");
				elements[i] = scan.nextInt();
			}
			
			MaxBinaryHeap mbh = new MaxBinaryHeap(elements);
			
			do {
				
				switch(Main.getMenuOption(scan)) {
		
					case 1:
						System.out.println("Type integer and press Enter:\t");
						int num = scan.nextInt();
						mbh.add(new Node(num));
						System.out.println(num + " has been inserted.\n");
						break;
					case 2:
						System.out.println("The max item is: " + mbh.getRoot().data);
						break;
					case 3:
						System.out.println(mbh.deleteMax().data + " has been deleted!" + "\n");
						break;
					case 4:
						System.out.println("Total number of items in the heap are: " + mbh.getSize() + "\n");
						break;
					case 5:
						System.out.println("Items in the heap: ");
						mbh.display();
						break;
					case 6:
						quit = true;
						System.out.println("Thanks for playing. Goodbye.");
						break;
						
				}
				
			} while(!quit);
			
		}
		
		private static int getMenuOption(Scanner s)
		{
			System.out.println("1.Add an item to the Heap.\n"
					+ "2.Display the max item in the Heap.\n"
					+ "3.Delete max item from the Heap.\n"
					+ "4.Display total number of items currently present in the Heap.\n"
					+ "5.Print the items currently present in the Heap.\n"
					+ "6.Quit.\n"
					+ "Choose option (1,2,3...) and press Enter:\t");
			
			return s.nextInt();
		}

	}

