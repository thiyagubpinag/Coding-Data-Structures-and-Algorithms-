package com.morgan;

class Child {
	public void display() {
		System.out.println("child");
	}
}

public class PolyEx extends Child {
	public void display() {
		System.out.println("parent");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child a = new PolyEx();

		a.display();

	}

}
