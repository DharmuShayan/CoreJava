package com.blueribbon.stringbuffer;

/**
 * String Buffers are mutable
 * Thread-safe, Synchronized
 * String buffers are safe for use by multiple threads.
 * Only one method is overridden that is toString method
 *Default initial capacity is 16 and it will increase 2 *(old capacity +1)
 */
public class StringBufferedCreation {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
	}

}
