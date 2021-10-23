package com.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;
public class IntegerStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream.range(0, 20).forEach(System.out::println);
		
		//skip
		
		IntStream.range(0, 20).skip(5).forEach(System.out::println);
		
		//sum
		int sum=IntStream.range(0, 20).sum();
		System.out.println(sum);
		System.out.println("Next");
		int res[]={1,9,9,5,4,2,1,8,3};
		List<Integer> value=Arrays.stream(res).sorted().distinct().boxed().collect(Collectors.toList());
	    int num=value.size()-1;
	    int result=IntStream.rangeClosed(0, num).mapToObj(i->value.get(num-i)).skip(3).findFirst().get();
	    
	    System.out.println(result);
	    
	}

}
