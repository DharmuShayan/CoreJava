package info.inetsolv.collection;

import java.util.LinkedHashSet;

public class LinkedHashDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet();
		
		String i1 = new String("Null");
		String i2 = "Null";
		ls.add(i1);
		ls.add(i2);
		System.out.println(ls);
		System.out.println(11==12);
	}

}
