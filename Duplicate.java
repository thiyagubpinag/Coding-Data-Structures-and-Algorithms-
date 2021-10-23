package com.walmart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] a = "geek".toCharArray();
		ArrayList<Character> arr = new ArrayList<Character>(a.length);

		for (int i = 0; i < a.length; i++) {
			arr.add(a[i]);
		}

		List<String> result = new ArrayList<String>();
		result.add(arr.toString());

		for (int i = 0; i < arr.size(); i++) {
			for (int j = i; j < arr.size(); j++) {

				if (arr.get(i) != arr.get(j)) {
					swap(arr, i, j);
					result.add(arr.toString());
					swap(arr, i, j);

				}
			}
		}
		result.forEach(i -> {
			System.out.println(i);
		});
		System.out.println(result.size());

	}

	private static void swap(List<Character> arr, int i, int j) {
		// TODO Auto-generated method stub

		Character temp = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, temp);

	}

}
