/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program-3
 */
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);		
		SLL list = new SLL();
		boolean quit = false;
	
		do {
			
			switch(Main.getMenuOption(scan)) {
	
				case 1:
					System.out.println("Type integer and press Enter:\t");
					int num = scan.nextInt();
					list.add(num);
					System.out.println(num + " has been inserted.\n");
					break;
				case 2:
					list.delete();
					System.out.println("Has been deleted!" + "\n");
					break;
				case 3:
					System.out.println("Item at front is: " + list.peek() + "\n");
					break;
				case 4:
					System.out.println("Last item is: " + list.lastNode() + "\n");
					break;
				case 5:
					System.out.println("Total number of items in queue are: " + list.size() + "\n");
					break;
				case 6:
					System.out.println("Items in queue: " );
					list.displayItems();
					System.out.println();
					break;
				case 7:
					quit = true;
					System.out.println("Thanks for playing. Goodbye.");
					break;
			}
			
		} while(!quit);
		
	}
	
	private static int getMenuOption(Scanner s)
	{
		System.out.println("1.Insert an item to the queue.\n"
				+ "2.Delete an item from the queue.\n"
				+ "3.Display the item at front.\n"
				+ "4.Display the item at rear.\n"
				+ "5.Display total number of items currently present in the queue.\n"
				+ "6.Print the items currently present in the queue.\n"
				+ "7.Quit.\n"
				+ "Choose option (1,2,3...) and press Enter:\t");
		
		return s.nextInt();
	}

}
