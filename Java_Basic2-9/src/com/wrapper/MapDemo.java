package com.wrapper;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class MapDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		
		//HashMap map = new HashMap();
		//WeakHashMap map = new WeakHashMap();
		//IdentityHashMap map = new IdentityHashMap();
		
		LinkedHashMap map = new LinkedHashMap();
		Integer i=12;
		Integer i2=12;
		
		
//		Integer i = new Integer(12);
//		Integer i2 = new Integer(12);
		map.put(i, "Anj");
		map.put(i2, null);
		map.put(17, null);
		map.put(18, null);
		map.put(19, null);
		map.put(10, 34);
		map.put(11, null);
//		i=null;
//		System.gc();
		
		Set keySet = map.entrySet();
		//System.out.println(map.values());
		
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
		Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey() +"-"+ me.getValue());
		}
		
		
	}

}
