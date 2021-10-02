package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixRotation {
	public static List<List<Integer>> invertImage(List<List<Integer>> image) {
		// Write your code here
		int N = image.size();
		for (int k = 0; k < 2; k++) {
			for (int x = 0; x < N / 2; x++) {
				// Consider elements in group
				// of 4 in current square
				for (int y = x; y < N - x - 1; y++) {
					// Store current cell in
					// temp variable
					int temp = image.get(x).get(y);

					// Move values from right to top
					image.get(x).set(y, image.get(y).get(N - 1 - x));

					// Move values from bottom to right
					image.get(y).set(N - 1 - x, image.get(N - 1 - x).get(N - 1 - y));

					// Move values from left to bottom
					image.get(N - 1 - x).set(N - 1 - y, image.get(N - 1 - y).get(x));

					// Assign temp to left
					image.get(N - 1 - y).set(x, temp);
				}

				System.out.println("Image" + image);
			}
		}

		return image;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> input = new ArrayList<List<Integer>>();

		int k = 1;
		for (int i = 0; i < 3; i++) {
			input.add(i, Arrays.asList(k, k + 1, k + 2));
			k = k + 3;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(input.get(i).get(j));
			}
			System.out.println();
		}

		System.out.println(invertImage(input));

		ArrayList<String> a = new ArrayList<String>();
		a.add("abi");
		a.add("lol");
System.out.println(a.indexOf("abi"));
		System.out.println(a.contains("Abi"));

	}

}
