
//Java implementation of the
//above approach
import java.util.*;

class DistinctNumbers {

	// Function to find maximum
	// distinct elements after
	// removing k elements
	static int maxDistinctNum(int arr[], int n, int k) {
		HashMap<Integer, Integer> numToFreq = new HashMap<>();

		// Build frequency map
		for (int i = 0; i < n; i++) {
			numToFreq.put(arr[i], numToFreq.getOrDefault(arr[i], 0) + 1);
		}
		
		System.out.println(numToFreq);

		int result = 0;

		// Min-heap
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

		// Add all number with freq=1 to
		// result and push others to minHeap
		for (Map.Entry<Integer, Integer> p : numToFreq.entrySet()) {
			if (p.getValue() == 1)
				++result;
			else
				minHeap.add(p.getValue());
		}
		
		System.out.println(minHeap);

		// Perform k operations
		while (k != 0 && !minHeap.isEmpty()) {
			// Pop the top() element
			Integer t = minHeap.poll();

			// Increment Result
			if (t == 1) {
				++result;
			}

			// Reduce t and k
			// Push it again
			else {
				--t;
				--k;
				minHeap.add(t);
			}
		}

		// Return result
		return result;
	}

	// Driver code
	public static void main(String[] args) {
		int arr[] = { 5, 7, 5, 5, 1, 2, 2 };
		int n = arr.length;
		int k = 3;

		// Function Call
		System.out.println("Maximum distinct elements = " + maxDistinctNum(arr, n, k));
	}
}

// This code is contributed by rutvik_56
