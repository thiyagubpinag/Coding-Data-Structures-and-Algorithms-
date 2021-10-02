package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class searchAlgo {

	public static void whatFlavors(List<Integer> cost, int money) {
		// Write your code here

		Object[] costArr = cost.toArray().clone();

		Collections.sort(cost);

		int k, rem;

		for (int i = 0; i < cost.size(); i++) {
			k = cost.get(i);
			rem = money - cost.get(i);
			int location = Arrays.binarySearch(cost.toArray(), i + 1, cost.size(), rem);
			if (location >= 0 && location < cost.size() && cost.get(location) == rem) {
				getIndex(costArr, cost.get(i), rem);
				break;
			}

		}

	}

	private static void getIndex(Object[] cost, int k, int location) {

		System.out.println(k + "," + location);

		int value1 = getIndexValue(cost, k, -1);
		int value2 = getIndexValue(cost, location, value1);

		System.out.println(value1 + "," + value2);

		String result = Math.min(value1, value2) + " " + Math.max(value1, value2);
		System.out.println(result);

	}

	private static int getIndexValue(Object[] cost, int location, int exclude) {

		for (int i = 0; i < cost.length; i++) {
			if (location == (int) cost[i] && i != exclude) {
				return i + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> prices = new ArrayList();

		int arr[] = { 1 ,2 ,3 ,5 ,6 };

		for (int i = 0; i < arr.length; i++) {
			prices.add(arr[i]);
		}

		whatFlavors(prices, 5);

	}

}
