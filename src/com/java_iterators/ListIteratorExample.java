package com.java_iterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String args []) {
		
		ArrayList al = new ArrayList<>();
		for(int i=0; i<10; i++) {
			al.add(i);
		}
		System.out.print("Array List AL : "+al);
	
		ListIterator lite = al.listIterator();
		
		while(lite.hasNext()) {
			
//			System.out.print("i = "+lite.next());
			
			int i = (Integer) lite.next();
			System.out.println(i +" ");
			if (i%2==0) 
            { 
				System.out.println("Inside if i= "+i);
                i++;  // Change to odd 
                System.out.println("Set i= "+i);
                lite.set(i);  // set method to change value 
                System.out.println("Add i= "+i);
                lite.add(i);  // to add 
            } 
			System.out.println(); 
	        System.out.println(al); 
		}
	}
}
