package com.CollectionFromIterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

//Using For Loop
public class CollectionFromItrForLoop {
	
	public static Collection<Integer> getCollectionFromIterator(Iterable<Integer> itr){
		Collection<Integer> coll = new ArrayList<Integer>();
		
		for(int i : itr) {
			coll.add(i);
		}
		
		return coll;
	}
	public static void main(String[] args) 
    { 
        Iterable<Integer> i = Arrays.asList(1, 2, 3, 4); 
        System.out.println("Iterable List : " + i); 
  
        Collection<Integer> cn = getCollectionFromIterator(i); 
        System.out.println("Collection List : " + cn); 
    }

}
