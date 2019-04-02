package info.inetsolv.collection;

import java.util.*;
import java.util.Set;

@SuppressWarnings("unused")
public class HashMapDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	/*	HashMap map =new HashMap();
		
		//WeakHashMap map =new WeakHashMap();
		Integer i1 = new Integer("100");
		//Integer i1 =100;
		map.put(i1, "abc");
		
	     i1=null;

		System.gc();
		System.out.print(map);*/
		
		
	/*	Hashtable h = new Hashtable();
		h.put(1, null);
		System.out.println(h);*/
		
		HashMap map =new HashMap();
		map.put(null, 10);
		map.put(null, null);
		map.put(null, null);map.put(null, null);
		System.out.println(map);
	}

}
