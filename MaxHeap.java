package com.alcatel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MaxHeap {

	public static int findKthLargest(List<Integer> ints, int k) {
		ArrayList res=new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
		// or pass `Comparator.reverseOrder()`
		pq.addAll(ints);

		// pop from max-heap exactly `k-1` times
		while (--k > 0) {
			
			
			res.add(pq.peek());
			pq.poll();
		}
		
		res.add(pq.peek());
		
		System.out.println(res);

		// return the root of max-heap
		return pq.peek();
	}

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(7, 4, 6, 3, 9, 1);
		int k = 3;

		System.out.println("k'th largest array element is " + findKthLargest(ints, k));
	}

}
