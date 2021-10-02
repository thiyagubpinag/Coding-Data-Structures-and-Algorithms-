package com.hackerrank;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 2, 1 };

		int countSwap=0;
		for (int i = 0; i < 3; i++) {
			for (int j = i; j < 3; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					countSwap++;
				}
			}
		}
		
		System.out.println(countSwap);

		for (int i = 0; i < 3; i++) {

			System.out.print(arr[i]);
		}

	}

}
