package hackerRank;

import java.util.HashSet;
import java.util.Scanner;

public class CavityMap {
	private final int n;
	private final Vertex[][] cells;

	public CavityMap(int n, int[][] height) {
		this.n = n;
		cells = new Vertex[n][];
		for (int i = 0; i < n; i++) {
			cells[i] = new Vertex[n];
			for (int j = 0; j < n; j++) {
				cells[i][j] = new Vertex(i, j, height[i][j]);
			}
		}
	}

	public Vertex[][] getCells() {
		return cells;
	}

	private class Vertex {
		private final int row;
		private final int column;
		private final int height;

		private Vertex(int row, int column, int height) {
			this.row = row;
			this.column = column;
			this.height = height;
		}
		
		private boolean isOnTheEdge(Vertex v) {
			if (v.column == 0 || 
				v.column == n - 1 || 
				v.row == 0 || 
				v.row == n - 1) {
				return true;
			} else {
				return false;
			}
		}

		public HashSet<Vertex> getNeighbors(Vertex v) {
			HashSet<Vertex> neighbors = new HashSet<Vertex>();
			neighbors.add(cells[v.column][v.row - 1]);
			neighbors.add(cells[v.column + 1][v.row]);
			neighbors.add(cells[v.column][v.row + 1]);
			neighbors.add(cells[v.column - 1][v.row]);
			return neighbors;
		}
	}

	public static void main(String[] args) {

		CavityMap map = readInput();
		Vertex[][] cells = map.getCells();

		for (int i = 0; i < map.n; i++) {
			for (int j = 0; j < map.n; j++) {
				System.out.print(cells[i][j].height);
			} System.out.println();
		}
	}

	private static CavityMap readInput() {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		try {
			String[] input = new String[n];
			for (int i = 0; i < n; i++) {
				input[i] = scanner.nextLine();
			}
			int[][] heigth = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					heigth[i][j] = input[i].charAt(j)-48;
				}
			}
			CavityMap map = new CavityMap(n, heigth);
			return map;
		} finally {
			scanner.close();
		}
	}
}
