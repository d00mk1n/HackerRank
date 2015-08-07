package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class FansAndBuns {

	static boolean isPartOf(int[] a, int n) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				count++;
			}
		}
		if (count == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfFans = scanner.nextInt();
		int timesOfOrder[] = new int[numberOfFans];
		int durations[] = new int[numberOfFans];

		for (int i = 0; i < numberOfFans; i++) {
			timesOfOrder[i] = scanner.nextInt();
			durations[i] = scanner.nextInt();
		}

		int totals[] = new int[numberOfFans];
		int totalsSorted[] = new int[numberOfFans];
		for (int i = 0; i < totals.length; i++) {
			totals[i] = timesOfOrder[i] + durations[i];
			totalsSorted[i] = timesOfOrder[i] + durations[i];
		}

		Arrays.sort(totalsSorted);
		
		int done[] = new int[numberOfFans];
		for (int i = 0; i < totalsSorted.length; i++) {
			for (int j = 0; j < totals.length; j++) {
				if ((totalsSorted[i] == totals[j]) && !isPartOf(done, totals[j])) {
					System.out.println(j + 1);
					totals[j] = done[i];
					break;
				}
			}
		}
	}
}
