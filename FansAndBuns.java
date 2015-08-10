package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FansAndBuns {

	public static void main(String[] args) {

		List<Fan> fans = readInput();
		Collections.sort(fans);

		for (Fan fan : fans) {
			System.out.print(fan.id + " ");
		}
	}

	private static List<Fan> readInput() {
		Scanner scanner = new Scanner(System.in);
		int numberOfFans = scanner.nextInt();
		try {

			List<Fan> fans = new ArrayList<>(numberOfFans);

			for (int i = 0; i < numberOfFans; i++) {
				int timeOfOrder = scanner.nextInt();
				int duration = scanner.nextInt();
				fans.add(new Fan(i + 1, timeOfOrder + duration));
			}
			return fans;
		} finally {
			scanner.close();
		}
	}

	private static class Fan implements Comparable<Fan> {
		private final int id;

		private final int finishTime;

		private Fan(int id, int finishTime) {
			this.id = id;
			this.finishTime = finishTime;
		}

		@Override
		public int compareTo(Fan o) {
			return finishTime - o.finishTime;
		}
	}
}