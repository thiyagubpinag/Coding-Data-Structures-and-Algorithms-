package com.alcatel;

class Single {
	int i;

	static Single A = new Single();

	static Single getInstance() {
		return A;
	}

	private Single() {

	}
}

public class Singleton {
	public static void main(String[] args) {
		Single a;
		Single.getInstance().i=5;
		System.out.println(Single.getInstance().i);

	}

}
