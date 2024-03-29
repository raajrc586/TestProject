package com.java_iterators;
import java.util.Enumeration; 
import java.util.Vector; 
  
//Java program to demonstrate Enumeration 
public class enumerationIterator 
{ 
    public static void main(String[] args) 
    { 
        // Create a vector and print its contents 
        Vector v = new Vector(); 
        for (int i = 0; i < 10; i++) 
            v.addElement(i); 
        System.out.println(v); 
  
        // At beginning e(cursor) will point to 
        // index just before the first element in v 
        Enumeration e = v.elements(); 
  
        // Checking the next element availability 
        while (e.hasMoreElements()) 
        { 
            // moving cursor to next element 
            int i = (Integer)e.nextElement(); 
  
            System.out.println(i + " "); 
        } 
    } 
} 