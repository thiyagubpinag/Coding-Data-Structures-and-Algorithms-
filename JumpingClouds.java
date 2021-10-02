package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JumpingClouds {
	public static void main(String[] args) {
		long max = Long.MIN_VALUE;

		List<List<Integer>> arrList = new ArrayList<List<Integer>>();
		// Fill the list with 551
		System.out.println(arrList.size());
		List<Integer> columns=new ArrayList();
		
		ArrayList<Integer> result=new ArrayList<Integer>(10);
        for(int i=1;i<=10;i++){
            result.add(0);
        }
        
        System.out.println(result);
	}

}
