package com.searchCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Searching an int key in a list sorted in descending order.*/

public class searchElementsCollectionsDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList(); 
        al.add(100); 
        al.add(50); 
        al.add(30); 
        al.add(10); 
        al.add(2); 
  
        System.out.println("List al : "+al);
        // The last parameter specifies the comparator method 
        // used for sorting. 
        int index = Collections.binarySearch(al, 50,  
                Collections.reverseOrder()); 
  
        System.out.println("Found at index " + index); 
	}

}
