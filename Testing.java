package com.alcatel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testing {

	private static Integer lock1 = 0;
	private static Integer lock2 = 0;

	public static void getObject(Object a1) {
		System.out.println("Object 1");
	}

	public static void getObject(String a1) {
		System.out.println("String 1");
	}

	public static void main(String[] args) {

		char a = 'D';
		a++;
		System.out.println(a);

		synchronized (lock1) {
			synchronized (lock2) {
				synchronized (lock2) {
					System.out.println("Hello");
				}
			}
		}

		Pattern p = Pattern.compile("\\d+");// . represents single character
		Matcher m = p.matcher("ab2h4u67");
		int count = 0;
		while (m.find()) {
			count++;
			System.out.println(count);
		}

		Testing a1 = null;
		getObject(null);

		String s1 = "abc";
		String s2 = "cbd";

		for (int i = 0; i < s2.length(); i++) {
			s1.contains(s2.charAt(i) + "");
		}

		HashMap<String, Integer> result = new HashMap<String, Integer>();

		String s5 = "kkkk";

		for (int i = 0; i < s5.length(); i++) {
			for (int j = i; j < s5.length(); j++) {
				Integer counter = result.get(s5.substring(i, j + 1));
				if (counter == null) {
					result.put(s5.substring(i, j + 1), 0);
				} else {
					result.put(s5.substring(i, j + 1), counter + 1);
				}
			}
		}

		System.out.println(result);
		
		int counter = 0;
		String val, firstVal, remainingVal;
		
		 Iterator<Map.Entry<String, Integer>> iterator = result.entrySet().iterator();
		    while (iterator.hasNext()) {
		        Map.Entry<String, Integer> entry = iterator.next();
		        String value=entry.getKey();
		        
		        if (result.get(value) == 0) {
					val = value;
					firstVal = val.charAt(0) + "";
					remainingVal = val.substring(1, val.length());
					if (!remainingVal.equals(firstVal) && remainingVal.length()>=1 && result.get(remainingVal + firstVal) != null) {
						System.out.println(firstVal+remainingVal+","+firstVal+","+remainingVal);
						counter += 1;
						iterator.remove();
					}

				} else {
					counter += result.get(value);
				}
		        
		    }

		System.out.println(counter);

	}

}
