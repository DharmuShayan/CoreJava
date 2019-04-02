package com.blueribbon.map;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * WeakHashMap is exactly same as HashMap except that
 * HashMap dominates GC where as in case WeakHashMap, GC dominate WeakHashMap
 *
 */

public class WeakHashMapDemo {

	
	public static void main(String[] args) {

		System.out.println("----HashMap-----");
		String s1=new String("Name");
		String s2 = "20";
		
		 
		HashMap<String, String> map = new HashMap<>();
             map.put(s1, "Dharmu");
             map.put(s2, "B");
             map.put(null,null);
              s1=null;
             System.gc();
             System.out.println(map);
             
             System.out.println("Object will not remove");
             s2=null;
             System.gc();
             System.out.println(map);
		
         System.out.println("----WeakHashMap-----");
             
         	String s3=new String("Name");
    		String s4 = "20";
    		
    		 
    		WeakHashMap<String, String> map1 = new WeakHashMap<>();
                 map1.put(s3, "A");
                 map1.put(s4, "B");
                 
                  s3=null;
                 System.gc();
                 System.out.println(map1);
                 
                 System.out.println("Object will not remove");
                 s4=null;
                 System.gc();
                 System.out.println(map1);
	}

}
