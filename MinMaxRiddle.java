package com.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class MinMaxRiddle {
	

	static long[] riddle(long[] arr) {
		// complete this function
		long[] result = new long[arr.length];
		long max;

		long value;

		int j = 0;
		while (j < arr.length) {
			max = Integer.MIN_VALUE;

			for (int i = 0; i < arr.length - j; i++) {
				value = getMinValue(arr, i, j + 1);
				if (value > max) {
					max = value;
				}
			}

			result[j] = max;
			j++;
		}

		return result;

	}

	private static long getMinValue(long[] arr, int i, int j) {
		long min = Integer.MAX_VALUE;
		for (int k = i; k < i + j; k++) {
			if (arr[k] < min) {
				min = arr[k];
			}
		}

		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Long> prices = new ArrayList<Long>();

		long arr[] = { 3, 5, 4, 7, 6, 2 };

		for (int i = 0; i < arr.length; i++) {
			prices.add(arr[i]);
		}

		System.out.println(riddle(arr));

	}

}
