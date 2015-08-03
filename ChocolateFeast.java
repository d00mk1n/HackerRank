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

		int[] tests = new int[numberOfTries * 3];

		for (int i = 0; i < tests.length; i++) {
			add(tests, scanner.nextInt());
		}

		for (int i = 0; i < tests.length; i += 3) {
			int count = 0;

			int temp = 0;

			int money = tests[i];

			int cost = tests[i + 1];

			int wrapperCost = tests[i + 2];

			int stock = 0; // текущее количество шоколадок (=оберток) на руках

			stock = money / cost;

			if (stock < wrapperCost) {
				System.out.println(stock);
			}

			else {
				count = count + (stock - (stock % wrapperCost));

				while (stock >= wrapperCost) {
					stock = stock % wrapperCost + (stock / wrapperCost);

					count = count + stock;
				}

				System.out.println(count);
			}
		}
	}
}

