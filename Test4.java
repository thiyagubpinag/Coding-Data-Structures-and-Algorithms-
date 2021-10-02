package com.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test4 {

	// Complete the freqQuery function below.
	static List<Integer> freqQuery(List<List<Integer>> queries) {

		List<Integer> resultList = new ArrayList<Integer>();
		HashMap<Integer, Integer> resultMap = new HashMap();
		int command, commandValue, progress;

		for (int i = 0; i < queries.size(); i++) {
			command = queries.get(i).get(0);
			commandValue = queries.get(i).get(1);
			System.out.println(command + "," + commandValue);
			if (command == 1) {
				progress = resultMap.getOrDefault(commandValue, 0);
				resultMap.put(commandValue, progress + 1);
			} else if (command == 2) {
				if (resultMap.get(commandValue) != null)
					resultMap.put(commandValue, resultMap.get(commandValue) - 1);

			} else if (command == 3) {
				resultList.add(resultMap.containsValue(commandValue)?1:0);

			}

		}

		return resultList;

	}


	public static void main(String[] args) {
		List<List<Integer>> queries = new ArrayList<List<Integer>>();
		List<Integer> add1 = new ArrayList<Integer>();
		List<Integer> add2 = new ArrayList<Integer>();
		List<Integer> add3 = new ArrayList<Integer>();
		List<Integer> add4 = new ArrayList<Integer>();
		List<Integer> add5 = new ArrayList<Integer>();
		List<Integer> add6 = new ArrayList<Integer>();
		List<Integer> add7 = new ArrayList<Integer>();
		add1.add(1);
		add1.add(1);

		queries.add(add1);

		add2.add(2);
		add2.add(2);
		queries.add(add2);

		add3.add(3);
		add3.add(2);
		queries.add(add3);

		add4.add(1);
		add4.add(1);
		queries.add(add4);

		add6.add(1);
		add6.add(1);
		queries.add(add6);

		add5.add(2);
		add5.add(1);
		queries.add(add5);

		add7.add(3);
		add7.add(2);
		queries.add(add7);

		System.out.println(queries);
		System.out.println(freqQuery(queries));

	}

}
