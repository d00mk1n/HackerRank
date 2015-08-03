package hackerRank;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void add (int[] tests, int t) 
	{
		for (int i = 0; i < tests.length; i++) 
		{
			if (tests[i] == 0) 			
			{
				tests[i] = t;
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNextInt())
		{
			System.out.println("incorrect number of tries entered");
			System.exit(0);
		}
		int numberOfTries = scanner.nextInt();
		
		if (numberOfTries < 0 || numberOfTries > 100)
		{
			System.out.println("incorrect number of tries entered");
			System.exit(0);
			}
	
		int tests[] = new int[numberOfTries*2];
		
		for (int i = 0; i < tests.length; i++)
		{
			if (!scanner.hasNextInt())
			{
				System.out.println("incorrect number format");
				System.exit(0);
			}
			int t = scanner.nextInt();
			if (t < 0 || t > 1000000000) 
			{
				System.out.println("incorrect number entered");
				System.exit(0);	
			}
			add (tests, t);
		}
		
		for (int i = 0; i < tests.length; i++, i++)
		{
			int n0 = tests[i];
			
			int n1 = tests[i+1];
			
			if (n0 > n1)
			{
				System.out.println("incorrect period of numbers entered");
				System.exit(0);
			}
			
			int count = 0;
			
			for (int j = n0; j <= n1; j++) 
			{
				double s = Math.sqrt(j);
				if (s % 1 == 0) 
				{
					count++;
				}
			}
			
			System.out.println(count);
			
		}
		
	}

}
