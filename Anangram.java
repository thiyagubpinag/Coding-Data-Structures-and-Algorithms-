package com.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anangram {
	
	static void subString(String s){
        HashMap<String, Integer> map= new HashMap<>();
  
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char[] valC = s.substring(i, j+1).toCharArray();
                
                Arrays.sort(valC);
                System.out.println(valC);
                String val = new String(valC);
                if (map.containsKey(val)) 
                    map.put(val, map.get(val)+1);
                else 
                    map.put(val, 1);
            }
        }
        int anagramPairCount = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            anagramPairCount += (n * (n-1))/2;
        }
        System.out.println(anagramPairCount);
    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; ++i) {
			String str = sc.next().trim();
			subString(str);
		//	System.out.println(subString(str));
		}

	}

}
