package gcd;

/*
 * Jeff Haineault
 * CS3410
 * Fall 2015
 * Program1
 */
public class GCDBrute 
{

	public static void main(String[] args)
	{

		GCDBrute g = new GCDBrute();


		long t1  = System.nanoTime();
		long t2 = System.nanoTime();
		int m = 110017;
		
		t1 = System.nanoTime();
		g.gcd(m, 10);
		t2 = System.nanoTime();
		System.out.println("Nanoseconds gcd at 10: " + (t2-t1));		
		
		t1 = System.nanoTime();
		g.euclid(m, 10);
		t2 = System.nanoTime();
		System.out.println("Nanoseconds Euclid at 10: " + (t2-t1) + "\n");
		
		t1 = System.nanoTime();
		g.gcd(m, 100);
		t2 = System.nanoTime();
		System.out.println("Nanoseconds gcd at 100: " + (t2-t1));
		
		t1 = System.nanoTime();
		g.euclid(m, 100);
		t2 = System.nanoTime();
		System.out.println("Nanoseconds Euclid at 100: " + (t2-t1) + "\n");
		
		t1 = System.nanoTime();
		g.gcd(m, 1000);
		t2 = System.nanoTime();
		System.out.println("Nanoseconds gcd at 1000: " + (t2-t1));
		
		t1 = System.nanoTime();
		g.euclid(m, 1000);
		t2 = System.nanoTime();
		System.out.println("Nanoseconds Euclid at 1000: " + (t2-t1) + "\n");
		
		t1 = System.nanoTime();
		g.gcd(m, 10000);
		t2 = System.nanoTime();
		System.out.println("Nanoseconds gcd at 10000: " + (t2-t1));
		
		t1 = System.nanoTime();
		g.euclid(m, 10000);
		t2 = System.nanoTime();
		System.out.println("Nanoseconds Euclid at 10000: " + (t2-t1) + "\n");
		
		t1 = System.nanoTime();
		g.gcd(m, 100000);
		t2 = System.nanoTime();
		System.out.println("Nanoseconds gcd at 100000: " + (t2-t1));
		
		t1 = System.nanoTime();
		g.euclid(m, 100000);
		t2 = System.nanoTime();
		System.out.println("Nanoseconds Euclid at 100000: " + (t2-t1));
	
	
	}
	
	public static int gcd(int m, int n) 
	{	
		 int gcd = 1;
		 for (int k = 2; k <= m && k <= n; k++) 
		 {
			 if (m % k == 0 && n % k == 0)
			 gcd = k;
		 }
		 return gcd;
	}
	
	public static int euclid(int m, int n)
	{
		if(m % n == 0)
			return n;
		else
			return gcd(n, m % n);
	}
}
