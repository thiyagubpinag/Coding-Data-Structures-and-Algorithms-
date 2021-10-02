package com.alcatel;


public class Check1 {
	
	int a,b;
	Check1(int a,int b){
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args) {
		int A=2;
		int B=A;
		B=4;
		System.out.println(A+","+B);
		
		Check1 c1=new Check1(1,2);
		Check1 c2=c1;
		
		c2.a=5;
		
		System.out.println(c1.a+","+c1.b);
		System.out.println(c2.a+","+c2.b);
		
		
		
		

	}

}
