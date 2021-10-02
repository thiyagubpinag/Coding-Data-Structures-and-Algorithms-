package com.hackerrank;

public class Testing6 {

	public static int alternatingCharacters(String s) {
		// Write your code here

		int counter = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				counter += 1;
			}
		}
		return counter;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "BBBBB";
		
		System.out.println(alternatingCharacters(a));

	}

}
