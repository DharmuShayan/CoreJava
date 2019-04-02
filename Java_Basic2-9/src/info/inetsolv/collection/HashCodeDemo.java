package info.inetsolv.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashCodeDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Ram");
		
		
		set.add("Kumar");
		set.add("Cow");
		set.add("Rahim");
		//set.forEach(System.out::println);
		
		Iterator it=set.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
		

	}

}
