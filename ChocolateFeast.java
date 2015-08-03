package hackerRank;
import java.util.Scanner;

public class ChocolateFeast {
	
	public static void add(int[] tests, int t) {
		for (int i = 0; i < tests.length; i++) {
			if (tests[i] == 0) {
				tests[i] = t;
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numberOfTries = scanner.nextInt();
		
		int[] tests = new int[numberOfTries*3];
		
		for (int i = 0; i < tests.length; i++) 
		{
			add(tests, scanner.nextInt());
		}
	}	
}
