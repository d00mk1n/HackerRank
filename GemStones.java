package hackerRank;

import java.util.Scanner;

public class GemStones {

	public static char[] extChars(String s) {
		
		char[] chars = new char[s.length()];
		int countChar = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < chars.length; j++) {
				if (s.charAt(i) == chars[j]) {
					count++;
				}
			}
			if (count == 0) {
				chars[countChar] = s.charAt(i);
				countChar++;
			}
		}
		return chars;
	}

	public static char[] compare(char[] c0, char[] c1) {
		
		char[] chars = new char[c0.length];
		int charCount = 0;
		
		for (int i = 0; i < c0.length; i++) {
			for (int j = 0; j < c1.length; j++) {
				if (c0[i] == c1[j]) {
					chars[charCount] = c1[j];
					if (charCount < chars.length - 1) {
						charCount++;
					}
				}
			}
		}

		return chars;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfTests = Integer.parseInt(scanner.nextLine());

		String strings[] = new String[numberOfTests];
		
		for (int i = 0; i < strings.length; i++) {
			strings[i] = scanner.nextLine();
		}
		
		
	}
}
