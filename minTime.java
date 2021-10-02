package com.hackerrank;

import java.io.*;

public class minTime {

	static int findItems(int[] arr, int n, int temp) {
		int ans = 0;
		for (int i = 0; i < n; i++)
			ans += (temp / arr[i]);
		return ans;
	}

	static int bs(int[] arr, int n, int m, int high)

	{
		int low = 1;

		while (low < high) {
			int mid = (low + high) >> 1;
			int itm = findItems(arr, n, mid);

			if (itm < m)
				low = mid + 1;
			else
				high = mid;
		}

		return high;
	}

	static int minTime(int[] arr, int n, int m) {
		int maxval = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++)
			maxval = Math.max(maxval, arr[i]);

		return bs(arr, n, m, maxval * m);
	}

	// Driven Program
	static public void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int n = arr.length;
		int m = 11;

		System.out.println(minTime(arr, n, m));
	}
}

// This code is contributed by vt_m.
