package hackerRank;
import java.util.Scanner;

public class FansAndBuns {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numberOfFans = scanner.nextInt();
		
		int[] timeOfOrder = new int[numberOfFans];
		int[] duration = new int[numberOfFans];
	
		for (int i = 0; i < numberOfFans; i++) {
			timeOfOrder[i] = scanner.nextInt();
			duration[i] = scanner.nextInt();
		}	
	}
}
