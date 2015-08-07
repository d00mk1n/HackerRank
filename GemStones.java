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
			}  if (count == 0) {
				chars[countChar] = s.charAt(i);
				countChar++;
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
		
		for (int i = 0; i < strings.length; i++) {
			char[] chars = new char[strings[i].length()];
			chars = extChars(strings[i]);
			System.out.println(chars);
		}
	}
}
