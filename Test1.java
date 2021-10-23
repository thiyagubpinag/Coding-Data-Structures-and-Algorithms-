package com.walmart;

//Java implementation of the approach
import java.util.*;

class Test1 {

	static boolean ispower(long n) {
		if (n < 125) {
			return (n == 1 || n == 5 || n == 25);
		}
		if (n % 125 != 0) {
			return false;
		} else {
			return ispower(n / 125);
		}
	}

	static long number(String s, int i, int j) {
		long ans = 0;
		for (int x = i; x < j; x++) {
			ans = ans * 2 + (s.charAt(x) - '0');
		}
		return ans;
	}

	static int minCuts(String s, int n) {
		int[] dp = new int[n + 1];

		Arrays.fill(dp, n + 1);
		dp[0] = 0;

		for (int i = 1; i <= n; i++) {

			if (s.charAt(i - 1) == '0') {
				continue;
			}
			for (int j = 0; j < i; j++) {

				if (s.charAt(j) == '0') {
					continue;
				}

				long num = number(s, j, i);

				if (!ispower(num)) {
					continue;
				}

				dp[i] = Math.min(dp[i], dp[j] + 1);
			}
		}

		return ((dp[n] < n + 1) ? dp[n] : -1);
	}

	public static void main(String[] args) {
		String s = "101101101";
		int n = s.length();
		System.out.println(minCuts(s, n));
	}
}

// This code is contributed by 29AjayKumar
