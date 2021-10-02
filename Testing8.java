package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Testing8 {
	static long substrCount(int n, String s) {

		return 0;
	}

	public static void main(String[] args) {

		String a = "aaaa";

		System.out.println(substrCount1(a.length(), a));

	}

	// Complete the substrCount function below.
	static long substrCount1(int n, String s) {

		int counter = n;
		int consec = 1;
		int midIndex = -1;
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				counter += consec;
				consec++;
				if (midIndex > 0) {
					if ((midIndex - consec) > 0 && s.charAt(midIndex - consec) == s.charAt(i)) {
						counter++;
					} else {
						midIndex = -1;
					}
				}
			} else {
				consec = 1;
				if (((i - 2) >= 0) && s.charAt(i - 2) == s.charAt(i)) {
					counter++; // 3-char symmetry is detected
					midIndex = i - 1;
				} else {
					midIndex = -1;
				}
			}
		}
		return counter;
	}

}
