package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class minAbsoluteDiff {

	public static int minimumAbsoluteDifference(List<Integer> arr) {

		int max = Integer.MAX_VALUE, value;


		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				value = Math.abs(arr.get(i) - arr.get(j));
				if (value < max) {
					max = value;
				}
			}
		}

		System.out.println(max);

		return 0;
		// Write your code here

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> input = new ArrayList<Integer>();
		int arr[] = { 1, -3, 71, 68, 17 };

		for (int i = 0; i < arr.length; i++) {
			input.add(arr[i]);
		}

		minimumAbsoluteDifference(input);

	}

}
