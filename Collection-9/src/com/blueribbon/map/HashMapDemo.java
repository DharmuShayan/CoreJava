package com.blueribbon.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * permits null values and the null key.
 * not synchronized
 * Unordered data
 * the default load factor (0.75) 
 */
public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
         map.put(10,"Dharmu");
         map.put(40,"K");
         map.put(20,"d");
         map.put(100,"z");
         map.put(104,"c");
         map.put(106,"a");
         map.put(null,null);
         map.put(null,null);
         
         /**
          * Returns a Set view of the keys contained in this map.
          */
         Iterator<Integer> it = map.keySet().iterator();
         while (it.hasNext()) {
        	 System.out.println(it.next());
		}
         //map.keySet().forEach(System.out::println);
         
         System.out.println("-----------");
         /**
          * Returns a Collection view of the values contained in this map.
          */
         Iterator<String> i = map.values().iterator();
         while (i.hasNext()) {
        	 System.out.println(i.next());
		}
         
        // map.values().forEach(System.out::println);
         System.out.println("-----------");
         
         /**
          * Returns a Set view of the mappings contained in this map.
          */
         Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
         while (iterator.hasNext()) {
			Map.Entry<Integer,String> entry = (Map.Entry<Integer,String>) iterator.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
         
         System.out.println("-----------");
         
         
         /**
          * 
          */
         
         Iterator<Integer> it2 = map.keySet().iterator();
         while (it2.hasNext()) {
			System.out.println(map.get(it2.next()));
		}
         
         
  
         
	}

}
