package com.testing;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>(new Integer[] { 1, 3, 5, 8 });

		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			if (iterator.next() == 1) {
				numbers.add(1);
				numbers.remove(1);
			}

		}

		System.out.println(numbers);

	}

}
