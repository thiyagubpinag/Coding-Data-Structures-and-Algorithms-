package com.testing;

/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;

public class CandidateCode {
	public static void main(String args[]) throws Exception {

		// Write code here
		Scanner sc = new Scanner(System.in);

		int noOfStr = sc.nextInt();
		String[] resul = new String[noOfStr];
		for (int i = 0; i < noOfStr; i++) {
			resul[i] = sc.nextLine();
		}

		for (int j = 0; j < resul.length; j++) {
			String a = resul[j];

			char[] b = a.toCharArray();

			Arrays.sort(b);

			String sorted = new String(b);

			HashMap<Character, Integer> valueList = new HashMap();

			for (int i = 0; i < sorted.length(); i++) {
				valueList.put(sorted.charAt(i), (valueList.getOrDefault(sorted.charAt(i), 0)) + 1);
			}

			int max = Collections.max(valueList.values());

			for (int i = 0; i < sorted.length(); i++) {
				if (valueList.get(sorted.charAt(i)) == max) {
					System.out.println(sorted.charAt(i));
					break;
				}
			}
		}

	}
}
