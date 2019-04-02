package com.blueribbon.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * elements are ordered using their natural ordering
 *  is not synchronized
 *  not Thread-Safe
 *  Null not allow
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,30,20,5,2,89,34,12);
		TreeSet<Object> set = new TreeSet<Object>(list);
             
		System.out.println(set);
		
		
		/**
		 * Returns an iterator over the elements in this set
		 */
		Iterator<Object> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());	
		}
		
		
		System.out.println("-----descendingIterator-----");
		Iterator<Object> i = set.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		/**
		 * Returns a reverse order view of the elements contained in this set.
		 */
		NavigableSet<Object> de = set.descendingSet();
		System.out.println(de);
		
	}

}
