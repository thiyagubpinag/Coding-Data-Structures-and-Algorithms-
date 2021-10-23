package com.walmart;

import java.util.ArrayList;

public class HardProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "xxx........xxxxxx";

		ArrayList<Integer> tempArr = new ArrayList();

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'x') {
				tempArr.add(i);
			}
		}

		System.out.println(tempArr);
		int mid = tempArr.size() / 2;
		int count = 0;

		int leftCount = 0, rightCount = 0;

		for (int i = 0; i < tempArr.size(); i++) {
			if (tempArr.get(i) < tempArr.get(mid)) {
				leftCount += 1;
				count += ((tempArr.get(mid) - leftCount) - tempArr.get(i));
			} else if (tempArr.get(i) > tempArr.get(mid)) {
				rightCount += 1;
				count += (tempArr.get(i) - (tempArr.get(mid) + rightCount));
			}
		}
		
		System.out.println(count);

	}

}
