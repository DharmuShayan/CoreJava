package com.blueribbon.map;


import java.util.Hashtable;


/**
 * This class implements a hash table, which maps keys to values. 
 * Any non-null object can be used as a key or as a value.
 * default initial capacity (11) and load factor (0.75).
 * Hashtable is synchronized
 * If a thread-safe implementation is not needed, it is recommended to use HashMap in place of Hashtable.
 */
public class HashtableDemo {

	public static void main(String[] args) {
	
		
		Hashtable<Integer,String> map = new Hashtable<>();
		map.put(9,"c");
		map.put(7,"b");
		map.put(5,"a");
		map.put(16,"f");
		map.put(18,"g");
		map.put(15,"c");
		
		System.out.println(map);//{9=c, 18=g, 7=b, 16=f, 5=a, 15=c}
		
		
		
	}

}
