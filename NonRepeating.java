package com.alcatel;

import java.util.LinkedList;
import java.util.Queue;

public class NonRepeating {
	final static int MAX_CHAR = 26;

	static void firstNonRepeating(String str)
	{
		String result="";
		
		Queue<Character> q=new LinkedList<>();
		
		int charCount[]=new int[26];
		
		for(int i=0;i<str.length();i++)
		{
			String innerRes="";
			char a=str.charAt(i);
			charCount[a-'a']++;
			
			q.add(a);
			
			while(!q.isEmpty())
			{
				if(charCount[q.peek()-'a']>1){
					q.remove();
				}else{
					innerRes=Character.toString(q.peek());
					break;
				}
				
			}
			
			if(innerRes==""){
				result+="-1";
			}else{
				result+=innerRes;
			}
			
		}
	
		System.out.println(result);
		
		
		
	}

	public static void main(String[] args)
	{
		String str = "aabccb";
		firstNonRepeating(str);
	}
}
