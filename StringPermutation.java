package com.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StringPermutation {

	public List<String> permute(char input[]) {
		HashMap<Character, Integer> countMap = new HashMap();

		for (int i = 0; i < input.length; i++) {
			countMap.put(input[i], (countMap.getOrDefault(input[i], 0)) + 1);
		}
		char[] str = new char[countMap.size()];
		int[] count = new int[countMap.size()];
		int i = 0;
		for (Map.Entry<Character, Integer> entrySet : countMap.entrySet()) {
			str[i] = entrySet.getKey();
			count[i] = entrySet.getValue();
			i++;
		}

		System.out.println(countMap);

		char[] result = new char[input.length];
		List<String> resultList = new ArrayList<String>();

		permuteUtil(str, count, result, 0, resultList);

		return resultList;

	}

	public void permuteUtil(char str[], int count[], char result[], int level, List<String> resultList) {

		if (level == result.length) {
			resultList.add(new String(result));
			return;
		}

		for (int i = 0; i < str.length; i++) {
			if (count[i] == 0) {
				continue;
			}
			result[level] = str[i];
			count[i]--;
			permuteUtil(str, count, result, level + 1, resultList);
			count[i]++;

		}

	}

	private void printArray(char input[]) {
		for (char ch : input) {
			System.out.print(ch);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		StringPermutation sp = new StringPermutation();
		sp.permute("AABC".toCharArray()).forEach(s -> System.out.println(s));
	}
}