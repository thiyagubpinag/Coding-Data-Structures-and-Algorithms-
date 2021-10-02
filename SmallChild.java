package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SmallChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "HARRY";
		String b = "SALLY";

		int[][] arr = new int[a.length()+1][b.length()+1];

		for (int i = 1; i <= a.length(); i++) {
			for (int j = 1; j <= b.length(); j++) {
				if (a.charAt(i - 1) == b.charAt(j - 1)) {
					arr[i][j] = arr[i - 1][j - 1] + 1;
				} else {
					arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
				}
			}
		}
		

		for (int i = 0; i <= a.length(); i++) {
			for (int j = 0; j <= b.length(); j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println(arr[a.length()][b.length()]);

	}

}
