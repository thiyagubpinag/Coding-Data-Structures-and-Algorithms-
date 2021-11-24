package com.walmart;

public class CloneEx implements Cloneable{
	
	int a,b;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		CloneEx a1=new CloneEx();
		a1.a=1;
		a1.b=2;
		
		CloneEx a2=(CloneEx) a1.clone();
		a2.b=6;
		a1.b=7;
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a2.a);
		System.out.println(a2.b);

	}

}
