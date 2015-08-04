package hackerRank;

import java.util.Scanner;

public class PileOfSticks {
	
	static class Stick {
		
		int length;
		
		public Stick(int length) {	
			this.length = length;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numberOfSticks = scanner.nextInt();
		
		Stick[] pile = new Stick[numberOfSticks];
		for (int i = 0; i < pile.length; i++) {
			pile[i] = new Stick(scanner.nextInt());	
		}
	}
}