package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maximumToys {

	public static int maximumToys(List<Integer> prices, int k) {
		// Write your code here

		Collections.sort(prices);
		int sum = 0, count = 0;
		for (int i = 0; i < prices.size(); i++) {
			if (sum > k) {
				break;
			}
			sum += prices.get(i);
			count++;
			System.out.println(sum+","+count);
		}

		return count-1;

	}

	public static void main(String[] args) {
		List<Integer> prices = new ArrayList();

		int arr[] = { 1, 12, 5, 111, 200, 1000, 10 };

		for (int i = 0; i < arr.length; i++) {
			prices.add(arr[i]);
		}

		System.out.println(maximumToys(prices, 50));
	}
}
