package com.wrapper;



import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		
		TreeSet<Object> set = new TreeSet<>((e,d)->100);
		set.add("a");
		set.add("A");
		set.add(null);
		set.add(10);
		set.add(null);
		set.add(50);
		set.add(null);
		
	
		
		System.out.println(set);
	}

}
