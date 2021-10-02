package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test2 {

	public static int maxMin(List<Integer> arr, int k) {
		// Write your code here

		ArrayList<Integer> minima = new ArrayList<Integer>();
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		for (int i = 0; i < arr.size(); i++) {
			if (i + k <= arr.size()) {
				for (int j = i; j < i + k; j++) {
					minima.add(arr.get(j));
				}
				Collections.sort(minima);
			}
			if (minima.size() > 0) {
				resultList.add(minima.get(0));
			}
			minima.clear();
		}
		Collections.sort(resultList);

		return resultList.size() > 0 ? resultList.get(resultList.size() - 1) : -1;

	}

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub 5 2 5 4 6 8 3
		 */
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(5);
		b.add(2);
		b.add(5);
		b.add(4);
		b.add(6);
		b.add(8);
		// b.add(3);

		int k = 3;

		System.out.println(maxMin(b, k));

	}

}
