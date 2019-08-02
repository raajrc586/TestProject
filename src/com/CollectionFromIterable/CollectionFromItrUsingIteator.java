package com.CollectionFromIterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionFromItrUsingIteator {
	public static <T> Collection<T>  
    getCollectionFromIteralbe(Iterable<T> itr) 
{ 
// Create an empty Collection to hold the result 
Collection<T> cltn = new ArrayList<T>(); 

// Get the iterator at the iterable 
Iterator<T> iterator = itr.iterator(); 

// Iterate through the iterable using 
// iterator to add each element into the collection 
while (iterator.hasNext()) { 
cltn.add(iterator.next()); 
} 

// Return the converted collection 
return cltn; 
} 

public static void main(String[] args) 
{ 
Iterable<Integer> i = Arrays.asList(1, 2, 3, 4); 
System.out.println("Iterable List : " + i); 

Collection<Integer> cn = getCollectionFromIteralbe(i); 
System.out.println("Collection List : " + cn); 
} 
}
