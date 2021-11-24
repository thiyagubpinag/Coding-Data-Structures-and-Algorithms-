package com.archieves;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListEx {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> al1=new CopyOnWriteArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		
		al1.forEach(i->{
			al1.add(7);
			
		});
		
		al1.forEach(System.out::println);
		
		// TODO Auto-generated method stub
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();

		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add("F");
		al.add(1, "A2");
		System.out.println("Size of al after additions: " + al.size());

		// display the array list
		System.out.println("Contents of al: " + al);

		// Remove elements from the array list
		al.remove("F");
		al.remove(2);
		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);

		try {
			Iterator iterator = al.iterator();
			while (iterator.hasNext()) {
				iterator.remove();
			}
		} catch (UnsupportedOperationException e) {
			System.out.println("Method not supported:");
		}
		System.out.println("Size of al: " + al.size());

	}

}
