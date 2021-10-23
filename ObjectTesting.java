package com.hackerrank;

import java.util.Arrays;
import java.util.HashMap;

public class ObjectTesting {

	static class Obj {
		int a;
		int b;

		Obj(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 6 };
		int b = 0;

		HashMap<Obj, Integer> value = new HashMap();

		HashMap<String, Integer> value1 = new HashMap();

		value1.put("abc", 1);

		value1.put("abc", 2);

		System.out.println(value1);

		Obj a1 = new Obj(1, 2);

		Obj a2 = new Obj(1, 2);

		value.put(a1, 1);

		value.put(a2, 1);

		System.out.println(value);

		changeArray(a, b);

		Arrays.stream(a).sorted().forEach(i -> {
			System.out.println(i);
		});
		System.out.println(b);

	}

	private static void changeArray(int[] a, int b) {
		a[3] = 9;
		b = 10;

	}

}
