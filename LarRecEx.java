import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class LarRecEx {

	static int leftIndex;
	static int rightIndex;

	private static int SubRectangularMatrixWithMaximumSum(int[][] input) {
		ArrayList<Integer> value = new ArrayList<Integer>();
		int maxSum = Integer.MIN_VALUE;
		int store;
		int temp;
		int top=0,down=0,left=0,right=0;

		for (int i = 0; i < input[0].length; i++) {
			value.add(input[0][i]);
		}

		System.out.println(value);
		System.out.println(largestRectangleArea(value));

		store = largestRectangleArea(value);
		if (maxSum < store) {
			maxSum = store;
		}
		value.clear();
		for (int i = 1; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				temp = input[i][j] + input[i - 1][j];
				value.add(temp);
			}

			System.out.println(value);
			System.out.println(largestRectangleArea(value));

			store = largestRectangleArea(value);
			if (maxSum < store) {
				maxSum = store;
			}
			value.clear();
		}

		System.out.println(maxSum);
		return maxSum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] input = { 2, 1, 5, 6, 2, 3 };

		// List<Integer> inputList =
		// Arrays.stream(input).boxed().collect(Collectors.toList());

		// System.out.println("Max rectangle area: " +
		// largestRectangleArea(inputList));

		int input[][] = { { 2, 1, -3, -4, 5 }, { 0, 6, 3, 4, 1 }, { 2, -2, -1, 4, -5 }, { -3, 3, 1, 0, 3 } };
		SubRectangularMatrixWithMaximumSum(input);

	}

	private static int largestRectangleArea(List<Integer> input) {
		// TODO Auto-generated method stub
		int arrSize = input.size();

		ArrayList<Integer> left = new ArrayList(arrSize);
		ArrayList<Integer> right = new ArrayList(arrSize);

		Stack<Integer> values = new Stack();

		for (int i = 0; i < arrSize; i++) {
			if (values.isEmpty()) {
				left.add(0);
			} else {
				while (!values.isEmpty() && input.get(values.peek()) >= input.get(i)) {
					values.pop();
				}
				left.add(values.isEmpty() ? 0 : (values.peek() + 1));
			}

			values.add(i);
		}
		
		System.out.println("left"+left);

		values.clear();
		for (int i = arrSize - 1; i >= 0; i--) {
			if (values.isEmpty()) {
				right.add(arrSize - 1);
			} else {
				while (!values.isEmpty() && input.get(values.peek()) >= input.get(i)) {
					values.pop();
				}
				right.add(values.isEmpty() ? arrSize - 1 : (values.peek() - 1));
			}

			values.add(i);
		}

		Collections.reverse(right);

		int maxArea = Integer.MIN_VALUE;
		for (int i = 0; i < input.size(); i++) {
			if (maxArea < (input.get(i) * (right.get(i) - left.get(i) + 1))) {
				leftIndex = left.get(i);
				rightIndex = right.get(i);
				maxArea = input.get(i) * (right.get(i) - left.get(i) + 1);
			}
		}

		return maxArea;
	}

}
