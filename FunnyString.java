package hackerRank;

import java.util.Scanner;

public class FunnyString {
	
	private static String originalString;
	
	public FunnyString(String originalString) {
		this.originalString = originalString;
	}
	
public static boolean isFunny (String originalString) {
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
			if (isFunny(strings[i])) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}
		}
//		for (int i = 0; i < strings.length; i++) {
//			int count = 0;
//
//			if (count == 0) {
//				System.out.println("FUNNY");
//			} else {
//				System.out.println("NOT FUNNY");
//
//			}
//		}
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