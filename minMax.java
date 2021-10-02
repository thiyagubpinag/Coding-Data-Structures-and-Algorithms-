package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minMax {

	public static int maxMin(int k, List<Integer> arr) {
		int result = Integer.MAX_VALUE;
		int n = arr.size();

		Collections.sort(arr);
		
		System.out.println(arr);

		for (int i = 0; i <= n - k; i++)
		{
			System.out.println(i+","+(i + k - 1));
			result = Math.min(result, arr.get(i + k - 1) - arr.get(i));
		}

		return result;
		// Write your code her

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> prices = new ArrayList();

		int arr[] = { 10, 100, 300, 200, 1000, 20, 30 };

		for (int i = 0; i < arr.length; i++) {
			prices.add(arr[i]);
		}

		System.out.println(maxMin(4, prices));

	}

}
