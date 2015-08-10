package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class PryankaAndToys {

	public static void main(String[] args) {

		int[] toys = readInput();
		Arrays.sort(toys);
		int money = 0;
		int p = 0;
		while (p < toys.length) {
			money++;
			int firstToy = toys[p];
			while (p < toys.length && toys[p] <= firstToy + 4) {
				p++;
			}
		}
		System.out.println(money);
	}

	private static int[] readInput() {
		Scanner scanner = new Scanner(System.in);
		try {
			int numberOfToys = scanner.nextInt();

			int[] toys = new int[numberOfToys];

			for (int i = 0; i < toys.length; i++) {
				toys[i] = scanner.nextInt();
			}
			return toys;
		} finally {
			scanner.close();
		}
	}
}
