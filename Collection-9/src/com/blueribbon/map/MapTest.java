package com.blueribbon.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		 // Create a Map and add some values 
        Map<String, String> map = new HashMap<>(); 
        map.put("Name", "Aman"); 
        map.put("Address", "Kolkata"); 
  
      
  
        // remap the values using compute() method 
        map.compute("Name", (key, val) 
                                -> val.concat(" Singh")); 
        map.compute("Address", (key, val) 
                                   -> val.concat(" West-Bengal")); 
  
        // print new mapping 
        System.out.println("New Map: " + map); 
		
		Iterator<String>  it= map.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(map.get(it.next()));
			
		}
		
		
		map.keySet().forEach(System.out::println);
		Set<String> keySet = map.keySet();
		System.out.println(map.get(keySet));
		//map.values().forEach(System.out::println);
		
		 Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		 while(iterator.hasNext()) {
			 Object o=iterator.next();
			 Map.Entry me=(Map.Entry)o;
			 if(me.getKey()=="Name")
			 me.setValue("Hello");
			 System.out.println(me.getKey() +":"+me.getValue()); 
		 }
		
	}

}
