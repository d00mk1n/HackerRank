package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class PryankaAndToys {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfToys = scanner.nextInt();

		int[] toys = new int[numberOfToys];

		for (int i = 0; i < toys.length; i++) {
			toys[i] = scanner.nextInt();
		}
		Arrays.sort(toys);
		int count = 0;
		int money = 0;
		boolean smthBougth;
		for (int i = toys[0]; i <= toys[toys.length - 1]; i += 4) {
			smthBougth = false;
			for (int j = 0; j < toys.length; j++) {
				if (toys[j] >= i && toys[j] <= i + 4) {
					count++;
					smthBougth = true;
				}
			}
			if (smthBougth) {
				money++;
			}
			if (count == toys.length) {
				System.out.println(money);
			}
		}
	}
}
