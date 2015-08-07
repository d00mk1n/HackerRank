package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class PryankaAndToys {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numberOfToys = scanner.nextInt();
		
		int[] toys = new int[numberOfToys];
		
		for (int i = 0; i < toys.length; i++) {
			toys[i] = scanner.nextInt();
		}
		Arrays.sort(toys);
		
	}

}
