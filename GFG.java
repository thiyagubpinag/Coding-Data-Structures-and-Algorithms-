package com.archieves;

//Java program to implement
//the above approach
import java.util.*;

class GFG {

	// Function to count distinct pairs
	// in array whose sum equal to K
	static int cntDisPairs(int arr[], int N, int K) {

		// Stores count of distinct pairs
		// whose sum equal to K
		int cntPairs = 0;

		// Store frequency of each distinct
		// element of the array
		HashMap<Integer, Integer> cntFre = new HashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {

			// Update frequency
			// of arr[i]
			if (cntFre.containsKey(arr[i]))
				cntFre.put(arr[i], cntFre.get(arr[i]) + 1);

			else
				cntFre.put(arr[i], 1);
		}

		System.out.println(cntFre);

		// Traverse the map
		for (Map.Entry<Integer, Integer> it : cntFre.entrySet()) {

			// Stores key value
			// of the map
			int i = it.getKey();

			System.out.println(2 * i + "," + K);
			// If i is the half of K
			if (2 * i == K) {

				// If frequency of i
				// greater than 1
				if (cntFre.get(i) > 1)
					cntPairs += 2;
			}

			else {
				if (cntFre.containsKey(K - i)) {

					// Update cntPairs
					cntPairs += 1;
				}
			}

			System.out.println(cntPairs);
		}

		// Update cntPairs
		cntPairs = cntPairs / 2;
		return cntPairs;
	}

	// Driver Code
	public static void main(String[] args) {
		int arr[] = { 7, 7, 5, 6, 5, 7, 7, 8 };
		int N = arr.length;
		int K = 14;
		System.out.print(cntDisPairs(arr, N, K));
	}
}

// This code is contributed by shikhasingrajput
