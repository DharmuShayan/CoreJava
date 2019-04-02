package com.blueribbon.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * A collection that contains no duplicate elements
 * HashSet is not synchronized and not Thread-safe. data will store Unordered(chaotic ordering).
 * This class permits the null element and at most one null element.
 */
public class HashSetDemo {

	
	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(10, 20, 30, 40, null, null);
		HashSet<Integer> set = new HashSet<>(asList);

		System.out.println(set);

		System.out.println(set.size());

		/**
		 * Returns true if this set contains the specified element.
		 */
		System.out.println(set.contains(40));

		
		/**
		 * Returns an iterator over the elements in this set.
		 */
		Iterator<Integer> it = set.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
