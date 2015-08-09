package hackerRank;


import java.util.Arrays;
import java.util.Scanner;

public class PileOfSticks {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
			int numberOfSticks = scanner.nextInt();

			int[] pile = new int[numberOfSticks];

			for (int i = 0; i < pile.length; i++) {
				pile[i] = scanner.nextInt();
			}

			Arrays.sort(pile);

			int curStick = -1;
			for (int i = 0; i < pile.length; i++) {
				if (curStick != pile[i]) {
					System.out.println(pile.length - i);
					curStick = pile[i];
				}
			}
		} finally {
			scanner.close();
		}
	}
}