package hackerRank;

import java.util.Scanner;

public class ChocolateFeast {

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
			
			int count = 0;
			int stock = 0; // текущее количество шоколадок (=оберток) на руках

			stock = moneys[i] / costs[i];

			if (stock < wrapperCosts[i]) {
				System.out.println(stock);
			}

			else {
				count = count + (stock - (stock % wrapperCosts[i]));

				while (stock >= wrapperCosts[i]) {
					stock = stock % wrapperCosts[i] + (stock / wrapperCosts[i]);

					count = count + stock;
				}

				System.out.println(count);
			}
		}
	}
}

