package com.wrapper;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	
	public static void main(String[] args) {
	
		TreeMap<String, String> map = new TreeMap<>();
		map.put("10", "a");
		map.put("40", "b");
		map.put("67", "c");
		map.put("102", "d");
		map.put("105", "e");
		map.put("101", "z");
		
		
		
//		Iterator<Entry<Object, Object>> it = map.entrySet().iterator();
//		while (it.hasNext()) {
//			Map.Entry<java.lang.Object, java.lang.Object> me = (Map.Entry<java.lang.Object, java.lang.Object>) it
//					.next();
//			System.out.println(me.getKey()+"::"+me.getValue());
//			System.out.println();
//		}
		
		Comparator<Map.Entry<String, String>> list=Map.Entry.comparingByKey();
		map.forEach((key,value) ->{System.out.println("Key: " + key + "" + " Value: " + value);});
	}

}
