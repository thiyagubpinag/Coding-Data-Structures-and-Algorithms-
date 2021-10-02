package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Triplet {

	public static boolean checkTripletMul(HashMap result, Long r, int number, ArrayList<Long> arr) {

		if (r == 1) {
			return (result.get(r * number) != null && result.get(r * number * number) != null) ? true : false;
		} else if (r == arr.get(arr.size() - 1)) {
			return (result.get(r / number) != null && result.get((r / number) / number) != null) ? true : false;
		}

		return (result.get(r / number) != null && result.get(r * number) != null) ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Long> arr = new ArrayList<Long>(Arrays.asList(1l, 3l, 9l, 9l, 27l, 81l));
		HashMap<Long, Long> result = new HashMap<Long, Long>();
		HashSet<List<Integer>> resultHashSet=new HashSet<List<Integer>>();
		List<Integer> resultListTemp=new ArrayList<Integer>();

		for (int i = 0; i < arr.size(); i++) {
			if (result.get(arr.get(i)) != null) {
				result.put(arr.get(i), result.get(arr.get(i)) + 1);
			} else {
				result.put(arr.get(i), 1l);
			}
		}

		int counter = 0;

		for (Long keyValue : result.keySet()) {
			if (checkTripletMul(result, keyValue, 3, arr)) {
				resultListTemp.add()
				counter += result.get(keyValue);
			}
		}

		System.out.println(counter);

	}

}
