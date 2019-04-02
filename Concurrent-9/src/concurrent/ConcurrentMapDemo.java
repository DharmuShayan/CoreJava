package concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();
		m.put(100, "Dharmu");
		m.put(101, "Dharmu Shayan");
		m.put(102, "Shayan");
		System.out.println(m);
		
		
		System.out.println("putIfAbsent()");
		m.putIfAbsent(100, "Chandan");//won't do anything if key is all ready available
		m.putIfAbsent(104, "Chandan");//add the obj if key is not available
		System.out.println(m);
		
		
		System.out.println("remove()");
		 m.put(100, "Chandan");
		 m.remove(100,"Dharmu");//match both key and value then it will remove the entry
		 m.remove(100);//only check key and remove the entry
		System.out.println(m);
		
		System.out.println("replace()");
		m.replace(104, "Chandan", "Riya");
		System.out.println(m);
		
	}

}
