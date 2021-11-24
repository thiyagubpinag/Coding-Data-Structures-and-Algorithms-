package com.archieves;

public class BuildHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };

		int n = arr.length;

		buildHeap(arr, n);

		printHeap(arr, n);

	}

	private static void buildHeap(int[] arr, int n) {
		// Index of last non-leaf node
		int startIdx = (n / 2) - 1;

		// Perform reverse level order traversal
		// from last non-leaf node and heapify
		// each node
		for (int i = startIdx; i >= 0; i--) {
			heapify(arr, n, i);
		}

	}

	private static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && arr[largest] < arr[left]) {
			largest = left;
		}

		if (right < n && arr[largest] < arr[right]) {
			largest = right;
		}

		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			heapify(arr, n, largest);
		}

	}

	static void printHeap(int arr[], int n) {
		System.out.println("Array representation of Heap is:");

		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

}
