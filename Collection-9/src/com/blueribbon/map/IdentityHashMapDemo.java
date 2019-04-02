package com.blueribbon.map;

import java.util.HashMap;
import java.util.IdentityHashMap;


/**
 *  using reference-equality in place of object-equality when comparing keys
 *  null values and the null key
 *
 */
public class IdentityHashMapDemo {

	
	public static void main(String[] args) {
		
		String s1="A";
		String s2="A";
		
		//HashMap<String,String> map=new HashMap<>();
		IdentityHashMap<String,String> map=new IdentityHashMap<>();

		map.put(s1, "D");
		map.put(s2, "d");
		map.put(null,null);
		System.out.println(map);
		
		
		
		System.out.println("-------");
		
		String s3=new String("B");
		String s4=new String("B");
		
		
		map.put(s3,"E");
		map.put(s4, "e");
		
		System.out.println(map);
		
	}

}
