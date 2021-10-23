package com.streams;

import java.util.Arrays;

public class StringStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a[]={"abi","aa","anusha","akilan"};
		
		//getting first value
		String result=Arrays.stream(a).sorted().findFirst().get();
		System.out.println(result);

	}

}
