package com.hackerrank;

import java.util.Stack;

public class BalancedString {

	public static String isBalanced(String s) {

		Stack<Character> values = new Stack();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				values.push(s.charAt(i));
			}
			System.out.println(values);
			if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
				switch (s.charAt(i)) {
				case ')':
					if (values.peek() != '(') {
						return "NO";
					} else {
						values.pop();
						break;
					}
				case '}':
					if (values.peek() != '{') {
						return "NO";
					} else {
						values.pop();
						break;
					}
				case ']':
					if (values.peek() != '[') {
						return "NO";
					} else {
						values.pop();
					}
				}
			}

		}

		return values.size()>0?"YES":"NO";
		// Write your code here

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "{{[[(())]]}}";

		System.out.println(isBalanced(a));

	}

}
