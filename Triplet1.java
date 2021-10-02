package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Triplet1 {

	static long triplets(int[] a, int[] b, int[] c) {

		
		Arrays.stream(a).distinct().toArray();
		long count = 0;

		int left, right;
		HashSet<Integer> distinct = new HashSet();

		for (int i = 0; i < b.length; i++) {
			if (!distinct.contains(b[i])) {
				left = getLeftCount(b[i], a);
				right = getRightCount(b[i], c);

				count += (left * right);
				distinct.add(b[i]);
			}
		}
		return count;

	}

	private static int getRightCount(int value, int[] c) {

		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (value >= c[i]) {
				count += 1;
			}
		}

		return count;
	}

	private static int getLeftCount(int value, int[] a) {

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= value) {
				count += 1;
			}
		}

		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 3, 5, 7 };

		int arr1[] = { 5, 7, 9 };

		int arr2[] = { 7, 9, 11, 13 };
		triplets(arr, arr1, arr2);

	}

}
