package hackerRank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GemStones {

	public static Set<Character> extChars(String s) {
		
		Set<Character> chars = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!chars.contains(c)) {
				chars.add(c);
			}
		}
		return chars;
	}

	public static Set<Character> compare(Set<Character> c0, Set<Character> c1) {
		Set<Character> result = new HashSet<>(c0);
		for(Character c: c0) {
			if (!c1.contains(c)) {
				result.remove(c);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			int numberOfTests = Integer.parseInt(scanner.nextLine());

			String strings[] = new String[numberOfTests];

			for (int i = 0; i < strings.length; i++) {
				strings[i] = scanner.nextLine();
			}

			Set<Character> chars = extChars(strings[0]);
			int i = 1;
			while (i < numberOfTests) {
				chars = compare(chars, extChars(strings[i]));
				i++;
			}

			System.out.println(chars.size());
		} finally {
			scanner.close();
		}
	}
}