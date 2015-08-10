package hackerRank;

import java.util.Scanner;

public class TwoStrings {

	public static boolean[] extrChars (String s) {
		boolean[] present = new boolean[26];
		for (int i = 0; i < s.length(); i++ ) {
			present [s.charAt(i) - 'a'] = true;
		} return present;
	}

	private static String[] readInput() {

		Scanner scanner = new Scanner(System.in);

		try {
			int numberOfTests = Integer.parseInt(scanner.nextLine());

			String strings[] = new String[numberOfTests * 2];

			for (int i = 0; i < strings.length; i++) {
				strings[i] = scanner.nextLine();
			}
			return strings;
		} finally {
			scanner.close();
		}
	}
	public static void main(String[] args) {

		String[] strings = readInput();

		outer: for (int i = 0; i < strings.length; i+=2) {
			boolean[] t1 = extrChars(strings[i]);
			boolean[] t2 = extrChars(strings[i+1]);
			for (int j = 0; j < 26; j++) {
				if (t1[j] && t2[j]) {
					System.out.println("YES");
					continue outer;
				}
			}
			System.out.println("NO");
		}
	}
}
