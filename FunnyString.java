package hackerRank;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = Integer.parseInt(scanner.nextLine());

		String strings[] = new String[numberOfTests];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = scanner.nextLine();
		}
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
			
		}
		for (int i = 0; i < strings.length; i++) {
			char chars[] = new char[strings[i].length()];
			int l = 0;
			for (l = strings[i].length() - 1; l >= 0; l--) {
				chars[strings[i].length() - 1 - l] = strings[i].charAt(l);
			}
			String stringR = new String(chars);

			int count = 0;

			for (int j = 1; j < strings[i].length(); j++) {
				int c1 = strings[i].charAt(j) - strings[i].charAt(j - 1);
				int c2 = stringR.charAt(j) - stringR.charAt(j - 1);
				if ((c1 != c2) && (c1 != c2 * (-1))) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("FUNNY");
			} else {
				System.out.println("NOT FUNNY");

			}
		}
	}
}
