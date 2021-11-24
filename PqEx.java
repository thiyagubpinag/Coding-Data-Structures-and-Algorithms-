package com.archieves;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PqEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> val = new ArrayList<Integer>();

		val.add(9);
		val.add(10);
		val.add(3);
		val.add(11);
		val.add(3);

		/*
		 * PriorityQueue<Integer> pq = new PriorityQueue(new
		 * Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { // TODO
		 * Auto-generated method stub return Integer.compare(o1, o2); }
		 * 
		 * }
		 * 
		 * );
		 */

		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);

		val.forEach(i -> {
			pq.add(i);
		});

		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
