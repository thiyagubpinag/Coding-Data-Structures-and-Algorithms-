package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String noOfList = s.nextLine();
		HashMap<Integer, Integer> firstListMap = new HashMap<Integer, Integer>();

		List<String> lengthArr = Arrays.asList(noOfList.split(" "));

		int firstListLength = Integer.valueOf(lengthArr.get(0));
		int secondListLength = Integer.valueOf(lengthArr.get(1));

		String[] firstListInput = s.nextLine().split(" ");
		System.out.println(firstListInput.length);

		ArrayList<Integer> firstList = new ArrayList<Integer>();
		for (int i = 0; i < firstListInput.length; i++) {
			firstList.add(i, Integer.parseInt(firstListInput[i]));
		}

		String[] secondListInput = s.nextLine().split(" ");
		System.out.println(secondListInput.length);
		ArrayList<Integer> secondList = new ArrayList<Integer>();

		for (int i = 0; i < secondListInput.length; i++) {
			secondList.add(i, Integer.parseInt(secondListInput[i]));
		}

		int counter = 0;
		int index;
		for (int i = 0; i < secondList.size(); i++) {
			if (!firstList.contains(secondList.get(i))) {
				counter += 1;
			} else {
				index = firstList.indexOf(secondList.get(i));
				firstList.remove(index);
			}
		}

		System.out.println(firstList.size() + counter-1);

	}

}
