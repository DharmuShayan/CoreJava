package com.blueribbon.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>(Arrays.asList(10, 30,3, 50, 29,  2, 4));
	
		
		ListIterator<Object> it = list.listIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		while (it.hasPrevious()) {
			System.out.println(it.previous());
			
		}

	}

}
