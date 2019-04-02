package com.blueribbon.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDemo2 {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>(Comparator.comparing(e->-e ));
		     set.addAll(Arrays.asList(-89,89,1,90,34,78,67));
		    			
		     
		     Iterator<Integer> it = set.iterator();
		     while (it.hasNext()) {
				 
				System.out.println(it.next());
			}
		     
	}

}
