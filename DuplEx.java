package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class a {

}

public class DuplEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> value = new ArrayList<Integer>();

		value.add(1);
		value.add(2);
		value.add(3);
		value.add(4);
		value.add(5);
		value.add(1);
		value.add(2);
		Arrays.stream(value.toArray()).distinct().forEach(System.out::println);

		// Arrays.stream(value.toArray()).filter(i ->
		// Collections.frequency(value, i) == 1).forEach(System.out::println);
	}

}
