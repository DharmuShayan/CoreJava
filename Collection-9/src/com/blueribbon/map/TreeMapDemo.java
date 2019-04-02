package com.blueribbon.map;

import java.util.TreeMap;

/**
 * map is sorted according to the natural ordering of its keys
 * is not synchronized
 * is not Thread-safe
 * null not allows
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();

		map.put(100, "a");
		map.put(10, "a");
		map.put(5, "a");
		map.put(-10, "a");
		//map.put(null, null);
		
		
		System.out.println(map);  //{-10=a, 5=a, 10=a, 100=a}
		
		
		System.out.println(map.descendingMap());//{100=a, 10=a, 5=a, -10=a}
		
		System.out.println(map.descendingKeySet());  //[100, 10, 5, -10]
		
		System.out.println(map.firstEntry());
		
		
		System.out.println(map.firstKey());
		
		System.out.println(map.lastEntry());
		System.out.println(map.lastKey());
		
		
		
	}

}
