package com.archieves;

public class Parent {
	public void show() {
		System.out.println("Parent");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent pa = new Child();
		pa.show();

	}
}

class Child extends Parent {
	public void show() {
		System.out.println("Child");
	}

}
