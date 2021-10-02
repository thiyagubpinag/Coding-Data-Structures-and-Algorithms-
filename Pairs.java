package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Pairs {
	public static int pairs(int k, List<Integer> arr) {

		int count = 0, small, great;
		int minimum, maximum;
		HashSet<String> valueStore = new HashSet();
		Collections.sort(arr);
		for (int i = 0; i < arr.size(); i++) {
			small = Math.max(arr.get(i), k) - Math.min(arr.get(i), k);
			great = Math.max(arr.get(i), k) + Math.min(arr.get(i), k);

			int location1 = Collections.binarySearch(arr, small);
			int location2 = Collections.binarySearch(arr, great);

			if (location1 >= 0 && location1 < arr.size() && location1 != i) {
				minimum = Math.min(arr.get(i), arr.get(location1));
				maximum = Math.max(arr.get(i), arr.get(location1));
				if (maximum - minimum == k && !valueStore.contains((minimum + "" + maximum))) {
					count += 1;
					valueStore.add(minimum + "" + maximum);
					continue;
				}
			}

			if (location2 >= 0 && location2 < arr.size() && location2 != i) {
				minimum = Math.min(arr.get(i), arr.get(location2));
				maximum = Math.max(arr.get(i), arr.get(location2));
				if (maximum - minimum == k && !valueStore.contains((minimum + "" + maximum))) {
					count += 1;
					valueStore.add(minimum + "" + maximum);
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		List<Integer> prices = new ArrayList<Integer>();

		int arr[] = { 1, 3, 5, 8, 6, 4, 2 };

		for (int i = 0; i < arr.length; i++) {
			prices.add(arr[i]);
		}

		System.out.println(pairs(2, prices));
	}

}
