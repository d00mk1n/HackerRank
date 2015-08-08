package hackerRank;

import java.util.Scanner;

public class FunnyString {

	private final String originalString;

	public FunnyString(String originalString) {
		this.originalString = originalString;
	}

	public boolean isFunny() {
		String stringR = new StringBuilder(originalString).reverse().toString();
		for (int j = 1; j < originalString.length(); j++) {
			int c1 = Math.abs(originalString.charAt(j) - originalString.charAt(j - 1));
			int c2 = Math.abs(stringR.charAt(j) - stringR.charAt(j - 1));
			if (c1 - c2 != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] strings = readInput();
		for (int i = 0; i < strings.length; i++) {
			if (new FunnyString(strings[i]).isFunny()) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}
		}
	}

	private static String[] readInput() {
		Scanner scanner = new Scanner(System.in);
		String strings[];
		try {
			int numberOfTests = Integer.parseInt(scanner.nextLine());

			strings = new String[numberOfTests];
			for (int i = 0; i < strings.length; i++) {
				strings[i] = scanner.nextLine();
			}
		} finally {
			scanner.close();
		}
		return strings;
	}
}
