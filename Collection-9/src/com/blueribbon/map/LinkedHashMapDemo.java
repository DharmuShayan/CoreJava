package com.blueribbon.map;

import java.util.LinkedHashMap;

/**
 * Order of Insertion preserved
 * Hash table and linked list implementation of the Map interface
 * null key as well as null allows
 * is not synchronized
 * is not Thread-Safe
 * default initial capacity (16) and load factor (0.75).
 */
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
		
		map.put(10,"HI");
		map.put(20, "A");
		map.put(30,"D");
		map.put(null, null);
		
		System.out.println(map);

	}

}
