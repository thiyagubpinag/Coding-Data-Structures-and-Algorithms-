package com.alcatel;

interface a{
	default void show(){
		System.out.println("a");
	};
	default boolean getOne(Object a){
		return true;
	}
}

interface b{
	default void show(){
		System.out.println("b");
	};
}

public class Testing1 implements a,b{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing1 a=new Testing1();
		a.show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		b.super.show();
	}


	

}
