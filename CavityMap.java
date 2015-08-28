package hackerRank;

import java.util.ArrayList;
import java.util.List;
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
	
	public int getN() {
        return n;
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
		private boolean isCavity() {
			if (isOnTheEdge()) {
				return false;
			}
			List<Vertex> neighbors = getNeighbors();
			for (Vertex ver : neighbors) {
				if (getHeight() <= ver.getHeight()) {
					return false;
				}
			}
			return true;

		}
		private boolean isOnTheEdge() {
				return column == 0 || 
						column == n - 1 || 
						row == 0 || 
						row == n - 1;
		}

		private List<Vertex> getNeighbors() {
			if (isOnTheEdge()) {
                throw new UnsupportedOperationException("Только для внутренних ячеек");
            }
			List<Vertex> neighbors = new ArrayList<Vertex>();
			neighbors.add(cells[row][column - 1]);
            neighbors.add(cells[row + 1][column]);
            neighbors.add(cells[row][column + 1]);
            neighbors.add(cells[row - 1][column]);
			return neighbors;
		}
		public int getHeight() {
			return height;
		}
		@Override
		public String toString() {
			return isCavity() ? "X" : String.valueOf(height);
		}
	}

	public static void main(String[] args) {

		CavityMap map = readInput();
		Vertex[][] cells = map.getCells();

		for (int i = 0; i < map.n; i++) {
			for (int j = 0; j < map.n; j++) {
				System.out.print(cells[i][j]);
			}
			System.out.println();
		}
	}

	private static CavityMap readInput() {

		Scanner scanner = new Scanner(System.in);
		try {
			int n = Integer.parseInt(scanner.nextLine());
			String[] input = new String[n];
			for (int i = 0; i < n; i++) {
				input[i] = scanner.nextLine();
			}
			int[][] heigth = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					heigth[i][j] = Character.getNumericValue(input[i].charAt(j));
				}
			}
			return new CavityMap(n, heigth);
		} finally {
			scanner.close();
		}
	}
}
