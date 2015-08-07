package hackerRank;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfTests = Integer.parseInt(scanner.nextLine());

		String strings[] = new String[numberOfTests * 2];

		for (int i = 0; i < strings.length; i++) {
			strings[i] = scanner.nextLine();
		}

		for (int i = 0; i < strings.length; i += 2) {
			int count = 0;
			for (int j = 0; j < strings[i].length(); j++) {
				for (int l = 0; l < strings[i + 1].length(); l++) {
					if (strings[i].charAt(j) == strings[i + 1].charAt(l)) {
						count++;
					}
				}
			}
			if (count == 0) {
				System.out.println("NO");
			} else {
			System.out.println("YES");
			}
		}
	}
}
