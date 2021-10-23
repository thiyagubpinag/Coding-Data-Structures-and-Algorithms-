package com.testing;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 6;
		System.out.println("GCD of " + a + " and " + b + " is " + findGCD(a, b));
	}

	static int findGCD(int a, int b) {
		System.out.println(a + "," + b);
		if (b == 0)
			return a;
		return findGCD(b, a % b);
	}

	static int lcm(int a, int b) {
		return (a / findGCD(a, b)) * b;
	}

}
