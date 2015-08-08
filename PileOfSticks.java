package hackerRank;

import java.util.Scanner;

public class PileOfSticks {
	
	public static void sort(int[] pile) {
		System.out.println(pile.length);
		int min = pile[0];
		int count = 0;
		int countUnEven=0;
		for (int i = 0; i < pile.length; i++) {
			if (pile[i] < min) {
				min = pile[i];
			}
		}
		for (int i = 0; i < pile.length; i++) {
			if (pile[i] - min > 0) {
				count++;
			}
		}
		int[] pile0 = new int[count];
		int j=0;
		for (int i = 0; i < pile.length; i++) {
			if (pile[i] - min > 0) {
				pile0[j] = pile[i] - min;
				j++;
			}
		}
		for (int i=0; i < pile0.length; i++) {
			if (pile0[0]!=pile0[i]) {
				countUnEven++;		
			}
		}
		if (countUnEven!=0) {
			sort(pile0);
		}
		else {
			System.out.println(pile0.length);
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numberOfSticks = scanner.nextInt();
		
		int[] pile = new int[numberOfSticks];
		for (int i = 0; i < pile.length; i++) {
			pile[i] = scanner.nextInt();	
		}
		sort(pile);
	}
}