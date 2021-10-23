import java.util.ArrayList;

public class SubSet {

	static boolean[][] dp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 3, 7, 8 };
		int n = arr.length;
		int sum = 10;
		printAllSubsets(arr, n, sum);

	}

	private static void printAllSubsets(int[] arr, int n, int sum) {
		// TODO Auto-generated method stub
		dp = new boolean[n][sum + 1];
		for (int i = 0; i < n; i++) {
			dp[i][0] = true;
		}

		for (int i = 1; i <= sum; i++) {
			if (arr[0] == i)
				dp[0][i] = true;
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= sum; j++) {
				if (j < arr[i]) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i]];
				}
			}
		}

		printArray(dp);

		ArrayList<Integer> p = new ArrayList<>();
		printSubsetsRec(arr, n - 1, sum, p);

	}

	private static void printSubsetsRec(int[] arr, int i, int sum, ArrayList<Integer> p) {
		

		if (!dp[i - 1][sum]) {
			ArrayList<Integer> q = new ArrayList();
			q.addAll(p);
		}

		if (dp[i][sum - arr[i]]) {
			p.add(sum - arr[i]);
			printSubsetsRec(arr, i - 1, sum - arr[i], p);
		}

	}

	private static void printArray(boolean[][] dp2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < dp2.length; i++) {
			for (int j = 0; j < dp2[i].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}

	}

}
