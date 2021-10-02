package com.alcatel;

class Single {

	static Single getInstance() {
		return new Single();
	}

	private Single() {

	}
}

public class Singleton {
	public static void main(String[] args) {
          Single a=new Single();
          System.out.println(a);
          System.out.println(a.getInstance());
      
	}

}
