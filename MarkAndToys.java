package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfToys = scanner.nextInt();
		int money = scanner.nextInt();

		int[] toys = new int[numberOfToys];

		for (int i = 0; i < numberOfToys; i++) {
			toys[i] = scanner.nextInt();
		}

		Arrays.sort(toys);

		int sum = 0;
		int i = 0;
		while (sum <= money && i < toys.length) {
			sum = sum + toys[i];
			if (sum <= money) {
				i++;
			}
		}
		System.out.println(i);
	}
}