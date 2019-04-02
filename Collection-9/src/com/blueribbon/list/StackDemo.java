package com.blueribbon.list;

import java.util.Stack;

/**
 * Stack class represents a last-in-first-out (LIFO) stack of objects. It
 * extends class Vector with five operations that allow a vector to be treated
 * as a stack push and pop operations are provided, as well as a method to peek
 * at the top item on the stack,
 */
public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();
		s.push(90);
		s.push(10);
		s.push(60);
		s.push(100);
		s.push(50);
		s.push(10);
		s.add(null);
		s.add(null);
		

		
		System.out.println(s);
		
		/**
		 * Removes the object at the top of this stack and returns 
		 * that object as the value of this function.
		 */
		System.out.println(s.pop());
		
		/**
		 * Returns the 1-based position where an object is on this stack.
		 */
		System.out.println(s.search(100));
		
		/**
		 * Looks at the object at the top of this stack without removing it from the stack.
		 */
		System.out.println(s.peek());
		
		/**
		 * Tests if this stack is empty.
		 */
		System.out.println(s.empty());
		
	}

}
