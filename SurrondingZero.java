package com.walmart;

public class SurrondingZero {

	public static void main(String[] args) {
		/*
		 * int M[][] = { { 1, 1, 1, 0, 1 }, { 1, 0, 0, 1, 0 }, { 1, 0, 1, 0, 1
		 * }, { 0, 1, 1, 1, 1 } };
		 */
		int M[][] = { { 0, 1, 1, 0 }, { 1, 0, 0, 1 }, { 0, 1, 0, 1 }, { 1, 0, 1, 1 } };

		rowSize = 4;
		colSize = 4;
		System.out.print(CountAllZero(M));
	}

	public static int[] row = { -1, 0, 0, 1 };
	public static int[] col = { 0, -1, 1, 0 };

	static int rowSize;
	static int colSize;

	private static int CountAllZero(int[][] m) {
		// TODO Auto-generated method stub

		int count = 0;

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				if (!notIterate(i, j) && m[i][j] == 0) {
					if (checkOnes(m, i - 1, j, "UP") && checkOnes(m, i, j - 1, "LEFT") && checkOnes(m, i + 1, j, "DOWN")
							&& checkOnes(m, i, j + 1, "RIGHT")) {
						count++;
					}

				}
			}
		}

		return count;
	}

	private static boolean checkOnes(int[][] m, int i, int j, String direction) {

		if (valid(i, j)) {
			if (m[i][j] == 1) {
				return true;
			} else {
				switch (direction) {
				case "UP":
					return checkOnes(m, i - 1, j, "UP");
				case "LEFT":
					return checkOnes(m, i, j - 1, "LEFT");
				case "DOWN":
					return checkOnes(m, i + 1, j, "DOWN");
				case "RIGHT":
					return checkOnes(m, i, j + 1, "RIGHT");
				}

			}
		}

		return false;

	}

	private static boolean valid(int i, int j) {
		// TODO Auto-generated method stub
		return i >= 0 && i < rowSize && j >= 0 && j < colSize;
	}

	private static boolean notIterate(int i, int j) {
		// TODO Auto-generated method stub
		return i == 0 || i == rowSize - 1 || j == 0 || j == colSize - 1;
	}

}
