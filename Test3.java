package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;

public class Test3 {

	public static String subString(String s) {
		String[] inputArr = s.split("");
		ArrayList<Character> inputArrList = new ArrayList(Arrays.asList(inputArr));
		System.out.println(inputArrList);
		Character value, nextValue;
		Character temp;
		for (int i = 0; i < inputArrList.size() - 1; i++) {
			value = inputArrList.get(i);
			nextValue = inputArrList.get(i + 1);
			System.out.println(value + "," + nextValue);
			if (value > nextValue) {
				temp = inputArrList.get(i);
				inputArrList.set(i + 1, inputArrList.get(i));
				inputArrList.set(i, temp);
			}
		}

		System.out.println(inputArrList);
		return inputArrList.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subString("abaacbac");
	}

}
