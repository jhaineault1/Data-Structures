/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program 2
 */
package program2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static final char leftP    = '(';
    private static final char rightP    = ')';
	private static final char lBRACE    = '{';
	private static final char rBRACE    = '}';
	private static final char lBRACKET  = '[';
	private static final char rBRACKET  = ']';
	
	public static void main(String[]args) throws IOException
	{
		String file = "";
		FileInputStream fis = new FileInputStream("Testfile.java");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	 
		String line = null;
		while ((line = br.readLine()) != null) {
			file += line;
		}
		br.close();
		if(isBalanced(file) == false)
			System.out.println("File does not contain correct pairing of parenthesis, brackets, or braces!");
		else
			System.out.println("Everything is correct!");
	}
	public static boolean isBalanced(String s) {
        Stack stack = new Stack(100);
        for (int i = 0; i < s.length(); i++) 
        {
            if(s.charAt(i) == leftP)   
            	stack.push(leftP);

            else if(s.charAt(i) == lBRACE)
            	stack.push(lBRACE);

            else if(s.charAt(i) == lBRACKET) 
            	stack.push(lBRACKET);

            else if(s.charAt(i) == rightP) 
            {
                if (stack.isEmpty())
                	return false;
                try {
					if(stack.pop() != leftP)
						return false;
				} catch (Exception e)
				{
					e.printStackTrace();
				}
            }

            else if(s.charAt(i) == rBRACE) 
            {
                if (stack.isEmpty())
                	return false;
                try {
					if(stack.pop() != lBRACE)
						return false;
				}catch(Exception e) 
				{
					e.printStackTrace();
				}
            }

            else if(s.charAt(i) == rBRACKET) 
            {
                if(stack.isEmpty())
                	return false;
                try {
					if(stack.pop() != lBRACKET)
						return false;
				} catch(Exception e) 
				{
					e.printStackTrace();
				}
            }
        }
        return stack.isEmpty();
    }

}
