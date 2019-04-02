package com.blueribbon.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListUsefullMethods {

	public static void main(String[] args) {
		List<Object> list1=Arrays.asList("10", 20, 40, 05, 67, 89,null,null);
		List<Object> list = new ArrayList<>(list1);
		
		
	
		System.out.println(list);

		/**
		 * Returns true if this list contains the specified element.
		 */
		System.out.println(list.contains(500));

		/**
		 * Removes the first occurrence of the specified element from this list, if it
		 * is present.
		 */

		System.out.println(list.remove(3));

		/**
		 * Removes from this list all of its elements that are contained in the
		 * specified collection.
		 */

		// System.out.println(list.removeAll(list));

		/**
		 * Returns the number of elements in this list.
		 */
		System.out.println(list.size());

		/**
		 * Performs the given action for each element of the Iterable until all elements
		 * have been processed or the action throws an exception.
		 */
		System.out.println("-----forEach()----");
		list.forEach(System.out::println);

		/**
		 * Returns a view of the portion of this list between the specified fromIndex,
		 * inclusive, and toIndex, exclusive.
		 */
		//System.out.println(list.subList(3, 7));

		/**
		 * Replaces the element at the specified position in this list with the
		 * specified element
		 */
		System.out.println(list.set(1, 900));

		System.out.println("-----ListIterator----");

		/**
		 * Returns a list iterator over the elements in this list (in proper sequence).
		 * we can add remove,set ,elements
		 */
		ListIterator<Object> li = list.listIterator();
		li.add(6000);
		while (li.hasNext()) {
			System.out.println(li.next());
			if (list.indexOf(3) == 5) {
				li.set(80000);
			}
			System.out.println(list);
		}
		System.out.println("-----Iterator----");
		/**
		 * Returns an iterator over the elements in this list in proper sequence. In
		 * iterator we can only remove elements
		 */
		Iterator<Object> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
			
		}
		
		
		
		
	}

}
