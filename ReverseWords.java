package com.alcatel;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWords {

	public static void main(String args[]){
		String words="one two three";
		
		ArrayList<Integer> spaceCount=new ArrayList<Integer>();
		spaceCount.add(0);
		for(int i=0;i<words.length();i++){
			if(words.charAt(i)==' '){
				spaceCount.add(i+1);
			}
		}
		spaceCount.add(words.length());
		
		Collections.reverse(spaceCount);
		String result="";
		for(int i=1;i<spaceCount.size();i++){
			result+=(words.substring(spaceCount.get(i), spaceCount.get(i-1))).trim()+" ";
		}
		
		//13,7,3,0
		
		
		
		
		System.out.println(result);
		
		
		
		
		
	}

}
