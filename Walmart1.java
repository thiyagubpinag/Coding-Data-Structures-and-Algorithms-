package com.archieves;

import java.util.Arrays;

public class Walmart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 111110111011011111001;
		int a[] = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1,0};

		int start = 0, end = 0;
		int max = Integer.MIN_VALUE;
		int counter = 0, tempCounter = 0;
		int repetitive1 = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 1) {
				counter++;
			} else {
				tempCounter = repetitive1;
				repetitive1 = counter;
				start = i - counter;
				end = i - 1;
				if (start - 1 > 0 && start - 2 > 0) {
					if (a[start - 1] == 0 && a[start - 2] == 1) {
						counter += tempCounter;
					}
				}
				if (counter > max) {
					max = counter;
				}

				counter = 0;
			}
		}

		if (counter > 0) {
			start = a.length - counter;
			end = a.length - 1;
			if (start - 1 > 0 && start - 2 > 0) {
				if (a[start - 1] == 0 && a[start - 2] == 1) {
					counter += repetitive1;
				}
			}
			if (counter > max) {
				max = counter;
			}
		}

		Arrays.stream(a).forEach(i -> {
			System.out.print(i + ",");
		});

		System.out.println();

		System.out.println("Start:" + start + ",end:" + end + ",max:" + max);

		if (max != end - start + 1) {

			int right = end - start + 1;
			int left = max - right + 1;
			int temp = a[start - 1];
			a[start - 1] = a[start - left];
			a[start - left] = temp;

		}

		Arrays.stream(a).forEach(i -> {
			System.out.print(i + ",");
		});

		System.out.println();

		System.out.println("Length of Array" + a.length);

		System.out.println("MAX REPETITIVE 1's able to form ->" + max);

	}

}
