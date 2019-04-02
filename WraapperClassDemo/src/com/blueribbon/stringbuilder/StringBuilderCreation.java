package com.blueribbon.stringbuilder;

/**
 * String Builder are mutable
 *  Not Thread-safe, not Synchronized
 * String Builder are  not safe for use by multiple threads.
 * Only one method is overridden that is toString method
 *Default initial capacity is 16 and it will increase 2 *(old capacity +1)
 */
public class StringBuilderCreation {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
	}

}
