import java.util.HashMap;

public class Islands {

	static int ROWS;
	static int COLS;
	static int countPairs;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int M[][] = new int[][] { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 1 } };

		ROWS = M.length;
		COLS = M[0].length;

		Islands I = new Islands();
		System.out.println("Number of islands is: " + I.countIslands(M));

	}

	private int countIslands(int[][] m) {
		// TODO Auto-generated method stub
		int noOfIslands = 0;
		HashMap<Integer, Integer> valueList = new HashMap<Integer, Integer>();

		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				if (m[i][j] == 1) {
					countPairs = 0;
					setAdjacentCellsValue(m, i, j);
					noOfIslands++;
					valueList.put(noOfIslands, countPairs);

				}
			}
		}

		System.out.println(valueList);

		return noOfIslands;
	}

	private void setAdjacentCellsValue(int[][] m, int i, int j) {

		if (isValid(m, i, j)) {
			m[i][j] = 2;
			countPairs++;
			setAdjacentCellsValue(m, i - 1, j);
			setAdjacentCellsValue(m, i, j - 1);
			setAdjacentCellsValue(m, i, j + 1);
			setAdjacentCellsValue(m, i + 1, j);
			setAdjacentCellsValue(m, i + 1, j + 1);
			setAdjacentCellsValue(m, i - 1, j - 1);
			setAdjacentCellsValue(m, i + 1, j - 1);
			setAdjacentCellsValue(m, i - 1, j + 1);

		}

	}

	private static boolean isValid(int m[][], int row2, int col2) {
		// TODO Auto-generated method stub
		return row2 >= 0 && row2 < ROWS && col2 >= 0 && col2 < COLS && m[row2][col2] == 1;
	}

}
