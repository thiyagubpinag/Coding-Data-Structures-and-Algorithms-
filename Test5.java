package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;

public class Test5 {

	public static int makeAnagram(String a, String b) {
		// Write your code here

		ArrayList<Character> firstString = new ArrayList(Arrays.asList(a.split("")));
		ArrayList<Character> secondString = new ArrayList(Arrays.asList(b.split("")));
		int total = firstString.size() + secondString.size();
		int counter = 0;
		for (int i = 0; i < firstString.size(); i++) {
			if (secondString.contains((firstString).get(i))) {
				counter += 1;
				secondString.remove(secondString.indexOf(firstString.get(i)));
			}
		}

		return total - (counter * 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "cde";
		String b = "abc";

		System.out.println(makeAnagram(a, b));

	}

}
