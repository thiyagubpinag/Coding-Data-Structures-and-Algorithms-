package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class LargestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> prices = new ArrayList<Integer>();

		int arr[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			prices.add(arr[i]);
		}

		System.out.println(largestRec(prices));

	}

	private static int largestRec(List<Integer> arr) {
		int count = 0;
		Collections.sort(arr);
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < arr.size(); i++) {
			int rem = arr.size() - i;
			if (maxValue < (rem * arr.get(i))) {
				maxValue = (rem * arr.get(i));
			}
		}

		System.out.println(maxValue);

		return 0;
	}

}
