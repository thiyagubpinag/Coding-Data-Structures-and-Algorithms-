package com.alcatel;

//Java program for checking
//balanced brackets
import java.util.*;

public class BalancedBrackets {

	// function to check if brackets are balanced
	static boolean areBracketsBalanced(String expr) {

		char val;

		ArrayList<Character> opened = new ArrayList<Character>(Arrays.asList('(', '{', '['));

		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < expr.length(); i++) {
			
 
			if (opened.contains(expr.charAt(i))) {
				stack.push(expr.charAt(i));
			}

			if (stack.isEmpty()) {
				return false;
			}

			switch (expr.charAt(i)) {
			case ')':
				val = stack.pop();
				if (val == '}' || val == ']') {
					return false;
				}
				break;
			case '}':
				val = stack.pop();
				if (val == ')' || val == ']') {
					return false;
				}
				break;
			case ']':
				val = stack.pop();
				if (val == '}' || val == ')') {
					return false;
				}
				break;
			}

		}

		return stack.isEmpty();
	}

	// Driver code
	public static void main(String[] args) {
		String expr = "(()((((()(";

		// Function call
		if (areBracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}
