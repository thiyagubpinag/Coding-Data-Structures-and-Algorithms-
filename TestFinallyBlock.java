package com.alcatel;

class TestFinallyBlock {
	public static void main(String args[]) {
		try {
			// below code do not throw any exception
			int data = 25 / 5;
			throw new RuntimeException();
		}
		// catch won't be executed
		catch (Exception e) {
			System.out.println("Exception");
		}
		// executed regardless of exception occurred or not
		finally {
			System.out.println("finally block is always executed");
		}

		System.out.println("rest of phe code...");
	}
}