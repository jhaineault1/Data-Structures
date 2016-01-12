package program_6;
/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program 6
 */
import java.util.Scanner;

public class Main {

		public static void main(String[] args) throws Exception {

			Scanner scan = new Scanner(System.in);		
			boolean quit = false;
			
			System.out.println("Enter the initial size of Hash Table: ");
			int numElements = scan.nextInt();
			
			System.out.println("Enter the load factor: ");
			float loadFactor = scan.nextFloat();
			
			MyHashMap mhm = new MyHashMap(numElements, loadFactor);
			
			do {
				
				switch(Main.getMenuOption(scan)) {
		
					case 1:
						System.out.println("Enter key: ");
						int key = scan.nextInt();
						System.out.println("Enter a value: ");
						int value = scan.nextInt();
						try
						{
							int [] result = mhm.insert(key, value);
							System.out.println("Item placed at: " + result[0]);
							System.out.println("Number of cells accessed: " + result[1]);
							
						}catch (Exception e)
						{
							System.out.println(e.toString());
						}
						
						break;
					case 2:
						System.out.println("Search for key: ");
						int key2 = scan.nextInt();
						int [] result2 = mhm.search(key2);
						if(result2[0] >= 0)
						{
							System.out.println("Found at index " + result2[0]);
							System.out.println("Cells accessed: " + result2[1] + "\n");
						}else{
							System.out.println("Not Found");
						}
						break;
						
					case 3:
						mhm.arrayPrint();
						break;
					case 4:
						quit = true;
						System.out.println("Have a nice day!");
						break;
				}
				
			} while(!quit);
			
		}
		
		private static int getMenuOption(Scanner s)
		{
			System.out.println("1.Insert item to the table.\n"
					+ "2.Search for a specific key.\n"
					+ "3.Display table.\n"
					+ "4.Quit.\n"
					+ "Choose option (1,2,3...) and press Enter:\t");
			
			return s.nextInt();
		}

	}
