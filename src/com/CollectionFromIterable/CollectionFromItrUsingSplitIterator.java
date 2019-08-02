package com.CollectionFromIterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class CollectionFromItrUsingSplitIterator {
	public static <T> Collection<T> 
    getCollectionFromIteralbe(Iterable<T> itr) 
{ 
// Create an empty Collection to hold the result 
Collection<T> cltn = new ArrayList<T>(); 

return StreamSupport.stream(itr.spliterator(), false) 
.collect(Collectors.toList()); 
} 

public static void main(String[] args) 
{ 
Iterable<Integer> i = Arrays.asList(1, 2, 3, 4); 
System.out.println("Iterable List : " + i); 

Collection<Integer> cn = getCollectionFromIteralbe(i); 
System.out.println("Collection List : " + cn); 
} 
}
