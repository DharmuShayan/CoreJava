package com.blueribbon.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//you have called iterator on a collection object, 
//and another thread tries to modify the collection object, 
//then concurrent modification exception will be thrown. 
//This is called fail-fast.

/**
 * Resizable-array implementation of the List interface.
 * it  is not synchronized
 * Each ArrayList instance has a capacity.
 *  its capacity grows automatically
 * permits all elements, including null.
 * Ordered list
 *int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
 *Returns the current capacity increased by 50% 
 */
public class ArrayListDemo {

	
	public static void main(String[] args) {

		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(47);
		list1.add(37);
		list1.add(null);

		
		List<Integer> list2 = new ArrayList<>(list1);
	
		list2.addAll(Arrays.asList(90,80,60,20,null,null));
		
		System.out.println(list1);
		System.out.println(list2);
	}

}
