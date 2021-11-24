package com.bosch;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x, y;
		x = 10;
		y = -10;
		System.out.println("Bitwise Left Shift: x<<2 = " + (x << 2));
		System.out.println("Bitwise Right Shift: x>>2 = " + (x >> 2));
		System.out.println("Bitwise Zero Fill Right Shift: x>>>2 = " + (x >>> 2));
		System.out.println("Bitwise Zero Fill Right Shift: y>>>2 = " + (y >>> 2));
		
		int z=30;
		
		System.out.println(~z);

	}

}
