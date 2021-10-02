package com.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Testing7 {

	public static String isValid(String s) {

		HashMap<Character, Integer> result1 = new HashMap<Character, Integer>();
		TreeSet<Integer> unique = new TreeSet<Integer>();
		int value;
		for (int i = 0; i < s.length(); i++) {
			value = result1.getOrDefault(s.charAt(i), 0);
			result1.put(s.charAt(i), value + 1);
		}

		for (Character value1 : result1.keySet()) {
			unique.add(result1.get(value1));
		}

		if (unique.size() > 2) {
			return "NO";
		} else if (unique.size() == 2) {
			if (unique.last() - 1 != unique.first()) {
				return "NO";
			}
			int count = 0;
			for (Character value1 : result1.keySet()) {
				if (result1.get(value1) == unique.last()) {
					count += 1;
				}
			}

			if (count > 1) {
				return "NO";
			}
		}

		return "YES";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "abccc";

		System.out.println(isValid(a));
	}

}
