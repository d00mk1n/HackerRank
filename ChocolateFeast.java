package hackerRank;

import java.util.Scanner;

public class ChocolateFeast {

	private static int exchange(int stock, int wrapperCost) {
		if (stock < wrapperCost) {
			return 0;
		} else {
			int chocosGained = stock / wrapperCost;
			stock = stock % wrapperCost;
			return chocosGained + exchange(stock + chocosGained, wrapperCost);
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfTests = scanner.nextInt();

		int[] moneys = new int[numberOfTests];
		int[] costs = new int[numberOfTests];
		int[] wrapperCosts = new int[numberOfTests];

		for (int i = 0; i < numberOfTests; i++) {
			moneys[i] = scanner.nextInt();
			costs[i] = scanner.nextInt();
			wrapperCosts[i] = scanner.nextInt();
		}

		for (int i = 0; i < numberOfTests; i++) {

			int stock = moneys[i] / costs[i];
		    int count = stock + exchange(stock, wrapperCosts[i]);
			System.out.println(count);
		}
	}
}

