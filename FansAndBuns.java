package hackerRank;

import java.util.Scanner;

public class FansAndBuns {

	static class Fan {

		int time;
		int dur;
		int total = time + dur;
		int num;

		public Fan(int time, int dur, int num) {
			this.time = time;
			this.dur = dur;
			this.num = num;
		}

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			int numberOfFans = scanner.nextInt();

			Fan[] fans = new Fan[numberOfFans];

			for (int i = 0; i < numberOfFans; i++) {
				fans[i] = new Fan(scanner.nextInt(), scanner.nextInt(), i);
			}
		}
	}
}
