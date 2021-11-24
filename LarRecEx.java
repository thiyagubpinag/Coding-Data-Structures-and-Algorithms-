package com.archieves;

import java.util.Arrays;
import java.util.Stack;

public class LarRecEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 2, 1, 5, 6, 2, 3 };
		System.out.println("Max rectangle area: " + largestRectangleArea(input));

	}

	private static String largestRectangleArea(int[] input) {
		// TODO Auto-generated method stub

		int arraySize = input.length;
		int[] left = new int[arraySize];
		int[] right = new int[arraySize];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < arraySize; i++) {
			System.out.println(stack);
			if (stack.isEmpty()) {
				left[i] = 0;
			} else {

				while (!stack.isEmpty() && input[stack.peek()] >= input[i])
					stack.pop();

				left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
			}
			
			stack.push(i);

		}
		

		Arrays.stream(left).forEach(i -> {
			System.out.print(i+" ");
		});

		return null;
	}

}
