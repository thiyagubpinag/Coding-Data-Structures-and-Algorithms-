
public class MinCostPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinCostPath mcp = new MinCostPath();
		int cost[][] = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 }, { 6, 2, 9 } };
		int result = mcp.minCost(cost, 3, 2);
		System.out.println(result);

	}

	private int minCost(int[][] cost, int row, int col) {
		// TODO Auto-generated method stub
		int[][] result = new int[row + 1][col + 1];
		int sumRight = 0;
		int sumDown = 0;

		//display(cost, row, col);
		//System.out.println();

		for (int m = 0; m <= col; m++) {
			sumRight += cost[0][m];
			result[0][m] = sumRight;
		}
		for (int m = 0; m <= row; m++) {
			sumDown += cost[m][0];
			result[m][0] = sumDown;
		}

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				result[i][j] = cost[i][j] + Math.min(cost[i - 1][j], cost[i][j - 1]);
			}
		}

		//display(result, row, col);

		return result[row][col];
	}

	private void display(int[][] result, int row, int col) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= col; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

	}

}
