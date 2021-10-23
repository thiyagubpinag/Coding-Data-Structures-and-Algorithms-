package com.walmart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.io.*;

class MaxOcc {

	static int maxRepeating(int arr[], int n, int k) {
		for (int i = 0; i < n; i++)
		{	
			System.out.println(arr[i]%k);
			arr[(arr[i] % k)] += k;
		}
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");

		int max = arr[0], result = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
				result = i;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 3, 5, 3, 4, 1, 7 };
		int n = arr.length;
		int k = 8;
		System.out.println("Maximum repeating element is: " + maxRepeating(arr, n, k));
	}
}
