package hackerRank;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		int[] tests = readInput();

		for (int i = 0; i < tests.length; i += 2) {
			int n0 = tests[i];
			int n1 = tests[i + 1];
			System.out.println(new SherlockAndSquares().solve(n0, n1));
		}
	}

	private int solve(int n0, int n1) {
		if (n0 > n1) {
			throw new IllegalArgumentException("incorrect period of numbers entered");
		}
		int left = (int) Math.ceil(Math.sqrt(n0));
		int right = (int) Math.floor(Math.sqrt(n1));

		return right - left + 1;
	}

	private static int[] readInput() {
		Scanner scanner = new Scanner(System.in);
		try {
			int numberOfTries = scanner.nextInt();

			if (numberOfTries < 0 || numberOfTries > 100) {
				throw new IllegalArgumentException("number of tests out of range");
			}

			int tests[] = new int[numberOfTries * 2];
			for (int i = 0; i < tests.length; i++) {
				int t = scanner.nextInt();
				if (t < 0 || t > 1e9) {
					throw new IllegalArgumentException("T is out of range");
				}
				tests[i] = t;
			}
			return tests;
		} finally {
			scanner.close();
		}
	}
}
