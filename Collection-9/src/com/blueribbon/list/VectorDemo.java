package com.blueribbon.list;

import java.util.Vector;

/**
 * Vector is Resizeable array 
 * The capacity is always at least as large as the vector size
 * Vector is synchronized 
 * Vector is thread-safe 
 * In Vector capacityIncrement we can specify
 * Vector is Legacy class
 * Default Size=10
 * new Size=2*Old Size()
 */
public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> list = new Vector<Integer>();
		
		list.add(null);
		list.add(0, null);
		
		System.out.println(list);
		/**
		 * Returns the current capacity of this vector.
		 */
		System.out.println(list.capacity());
		
		
		/**
		 * Sets the size of this vector.
		 */
		list.setSize(700);
		System.out.println(list.capacity());
		
		list.ensureCapacity(701);
		System.out.println(list.capacity());
		
	
		
		
	}

}
