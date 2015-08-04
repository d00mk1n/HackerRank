package hackerRank;

import java.util.Scanner;

public class PileOfSticks {
	
	static class Stick {
		
		int length;
		
		public Stick(int length) {	
			this.length = length;
		}
	}
	public static void sort(Stick[] pile) {
		System.out.println(pile.length);
		int min = pile[0].length;
		int count = 0;
		int countUnEven=0;
		for (int i = 0; i < pile.length; i++) {
			if (pile[i].length < min) {
				min = pile[i].length;
			}
		}
		for (int i = 0; i < pile.length; i++) {
			if (pile[i].length - min > 0) {
				count++;
			}
		}
		Stick[] pile0 = new Stick[count];
		int j=0;
		for (int i = 0; i < pile.length; i++) {
			if (pile[i].length - min > 0) {
				pile0[j] = new Stick(pile[i].length - min);
				j++;
			}
		}
		for (int i=0; i < pile0.length; i++) {
			if (pile0[0].length!=pile0[i].length) {
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
		
		Stick[] pile = new Stick[numberOfSticks];
		for (int i = 0; i < pile.length; i++) {
			pile[i] = new Stick(scanner.nextInt());	
		}
		sort(pile);
	}
}