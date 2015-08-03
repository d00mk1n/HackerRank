package hackerRank;

import java.util.Scanner;

public class SherlockAndSquares {
	
	//добавление чисел в массив

	public static void add (int[] tests, int t) 
	{
		for (int i = 0; i < tests.length; i++) 
		{
			//по условию числа должны быть больше нуля, так что должно сработать 
			//
			if (tests[i] == 0) 			{
				tests[i] = t;
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numberOfTries = scanner.nextInt();
		
		int tests[] = new int[numberOfTries*2];
		
		for (int i = 0; i < tests.length; i++)
		{
			add (tests, scanner.nextInt());
		}
		for (int i=0; i<tests.length; i++){System.out.println(tests[i]);}
		
		
		
	}

}
