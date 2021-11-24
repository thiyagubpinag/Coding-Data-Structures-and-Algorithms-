package com.archieves;

import java.util.Arrays;

public class MinJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		
		//           1  2  3  4  5  6  7  8  9  10  11
		int jump[]=new int[a.length];
		
		Arrays.fill(jump, Integer.MAX_VALUE-1);
		
		jump[0] = 0;
		
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(j+a[j]>=i)
				{
					if(jump[i]>jump[j]+1)
					{
						jump[i]=jump[j]+1;
					}
				}
			}
		}
		
		Arrays.stream(jump).forEach(System.out::println);
		
		

	}

}
