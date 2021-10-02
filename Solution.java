package com.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		int t;
		int n, m;

		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		HashMap<Integer, Integer> h = new HashMap<>();
		for (int test = 0; test < t; test++) {

			m = in.nextInt();
			n = in.nextInt();

			int first = -99999999;
			int last = -99999999;

			for (int i = 0; i < n; i++) {
				int r = in.nextInt();

				if (h.containsKey(m - r))

				{
				 System.out.println("contains key "+r);
					first = Math.min(h.get(m - r), i + 1);
					last = Math.max(h.get(m - r), i + 1);

				} else {
					if (m - r >= 0)
						h.put(r, i + 1);
				}

			}
			h.clear();
			System.out.println(first + " " + last);

		}

	}

}
