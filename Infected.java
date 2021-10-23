import java.util.ArrayList;
import java.util.Scanner;

class Infected {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int noOfTestCases = Integer.valueOf(sc.nextLine());

		ArrayList<Integer> resultList = new ArrayList<Integer>(noOfTestCases);

		for (int z = 0; z < noOfTestCases; z++) {

			String[] matrix = sc.nextLine().split(" ");
			int rows = Integer.valueOf(matrix[0]);
			int column = Integer.valueOf(matrix[1]);

			int a[][] = new int[rows][column];
			String getValue[];
			int goodCount = 0;
			for (int i = 0; i < rows; i++) {
				getValue = sc.nextLine().split("");
				for (int j = 0; j < column; j++) {
					if (getValue[j].equalsIgnoreCase("_")) {
						a[i][j] = -1;
					} else {
						a[i][j] = Integer.valueOf(getValue[j]);
						if (a[i][j] != 0) {
							goodCount++;
						}

					}
				}
			}

			// display(a, rows, column);

			int numOfDays = 0;
			int rowTemp[] = { -1, 0, 0, 1 };
			int colTemp[] = { 0, -1, 1, 0 };
			int rowValue, colValue;
			boolean visited[][] = new boolean[rows][column];

			while (goodCount > 0) {
				fillArray(visited, rows, column);
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < column; j++) {
						if (a[i][j] == -1) {
							continue;
						} else if (a[i][j] == 0 && !visited[i][j]) {
							for (int k = 0; k < 4; k++) {
								rowValue = rowTemp[k] + i;
								colValue = colTemp[k] + j;
								if (valid(rowValue, colValue, rows, column) && !visited[rowValue][colValue]) {
									if (a[rowValue][colValue] == 0 || a[rowValue][colValue] == -1) {
										continue;
									} else {
										a[rowValue][colValue] -= 1;
										if (a[rowValue][colValue] == 0) {
											goodCount--;
										}
										visited[rowValue][colValue] = true;
									}
								}
							}
						}

					}
				}
				numOfDays++;
			}

			resultList.add(numOfDays);
		}

		resultList.forEach(i -> {
			System.out.println(i);
		});

	}

	private static boolean valid(int i, int j, int row, int column) {
		// TODO Auto-generated method stub
		return i >= 0 && i < row && j >= 0 && j < column;
	}

	private static void fillArray(boolean[][] c, int row, int column) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				c[i][j] = false;
			}
		}
	}
}
