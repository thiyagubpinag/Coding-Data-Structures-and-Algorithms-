package com.morgan;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 3, 8, 10, 4, 8 };
		int sum = 11;
		Arrays.sort(a);

		Arrays.stream(a).forEach(i -> {
			System.out.println(i);
		});

		ArrayList<Integer> result = new ArrayList<Integer>();
		combination(a, 0, a.length - 1, result, sum);

	}

	private static void combination(int[] a, int i, int j, ArrayList<Integer> result, int sum) {

		if (sum < 0) {
			return;
		}

		if (sum == 0) {
			System.out.println(result);
		}

		for (int x = i + 1; x <= j; x++) {
			result.add(a[x]);
			combination(a, x, j, result, sum - a[x]);
			result.remove(result.size() - 1);
		}

	}

}
