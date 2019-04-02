package com.blueribbon.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



/**
 *  Doubly-linked list implementation of the List and Deque interfaces.
 *  Implements all optional list operations, and permits all elements (including null)
 *  LinkedList is not synchronized.
 *  LinkedList can perform LIFO and FIFO
 *  good for frequent Insertion and Deletion
 */
public class LinkedListDemo {


	public static void main(String[] args) {
		
		
		List<Integer> list1=Arrays.asList(10,30,50,30,90,40);
		
		LinkedList<Object> list = new LinkedList<>(list1);
		
		
		System.out.println(list);
		
		System.out.println("-----LIFO-----");
		
		/**
		 * Pops an element from the stack represented by this list.
		 */
		System.out.println(list.pop());
		
		System.out.println("-----FIFO-----");
		
		/**
		 * Adds the specified element as the tail (last element) of this list.
		 */
		System.out.println(list.offer(123));
		
		/**
		 * Inserts the specified element at the front of this list.
		 */
		System.out.println(list.offerFirst(121));
		
		/**
		 * Inserts the specified element at the end of this list.
		 */
		System.out.println(list.offerLast(898));
		
		/**
		 * Retrieves and removes the head (first element) of this list.
		 */
		System.out.println(list.poll());
		
		
		/**
		 * Retrieves and removes the first element of this list, or returns null if this list is empty.
		 */
		System.out.println(list.pollFirst());
		
        /**
         * Retrieves and removes the last element of this list, or returns null if this list is empty.
         */		
		System.out.println(list.pollLast());
		
		//list.forEach(System.out::println);
		
		System.out.println(list);
	}

}
