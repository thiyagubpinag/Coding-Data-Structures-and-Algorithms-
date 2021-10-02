package com.hackerrank;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<Integer> {

	Queue<Integer> queue = new LinkedList<Integer>();

	public void enqueue(Integer nextInt) {
		// TODO Auto-generated method stub
		this.queue.add(nextInt);

	}

	public void dequeue() {
		// TODO Auto-generated method stub

		this.queue.poll();

	}

	public Integer peek() {
		// TODO Auto-generated method stub
		return this.queue.peek();
	}

}
