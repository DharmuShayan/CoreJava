package com.blueribbon.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 *  Hash table and linked list implementation of the LinkedHashSet interface
 *  it maintains a doubly-linked list 
 *  defines the insertion-order
 *  insertion order is not affected if an element is re-inserted into the set.
 *  permits null elements
 *  Performance is likely to be just slightly below that of HashSet due to the added expense of maintaining the linked list
 *  A linked hash set has two parameters that affect its performance: initial capacity and load factor.
 *  is not synchronized and not Thread-safe.
 *
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(10,20,50,90,30);
		LinkedHashSet<Object> set = new LinkedHashSet<Object>(list);
         
          
          System.out.println(set);//[10, 20, 50, 90, 30]
	}

}
