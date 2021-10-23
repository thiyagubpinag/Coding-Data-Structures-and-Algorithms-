package com.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Output {

	public static double sumOfList(List<Double> list) {
		double a = 0.0;
		for (Number n : list) {
			a += n.doubleValue();
		}

		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List ld=(Arrays.asList(1.2,3.2,2.6));
		 * System.out.println(sumOfList(ld));
		 */

		
		Scanner sc=new Scanner(System.in);
		
		
		String a = sc.nextLine();

		char[] b = a.toCharArray();

		Arrays.sort(b);

		String sorted = new String(b);

		LinkedHashMap<Character, Integer> valueList = new LinkedHashMap();

		for (int i = 0; i < sorted.length(); i++) {
			valueList.put(sorted.charAt(i), (valueList.getOrDefault(sorted.charAt(i), 0)) + 1);
		}

		int max = Collections.max(valueList.values());
		
		for(int i=0;i<sorted.length();i++)
		{
			if(valueList.get(sorted.charAt(i))==max){
				System.out.println(sorted.charAt(i));
				break;
			}
		}

        
	}

}
