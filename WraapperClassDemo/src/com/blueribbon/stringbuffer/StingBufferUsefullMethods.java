package com.blueribbon.stringbuffer;

public class StingBufferUsefullMethods {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");

		/**
		 * Appends the specified string to this character sequence.
		 */
		System.out.println(sb1.append("World !"));
		
		/**
		 * Appends the specified StringBuffer to this sequence.
		 */
		System.out.println(sb1.append(sb2));
		
		
		/**
		 * Returns the current capacity.
		 */
		System.out.println(sb1.capacity());
		
		
		/**
		 * Ensures that the capacity is at least equal to the specified minimum.
		 */
		sb2.ensureCapacity(22);
		System.out.println(sb2.capacity()); //16+5=21   now 2*(21+1)=2*22=44
		
		/**
		 * Causes this character sequence to be replaced by the reverse of the sequence.
		 */
		System.out.println(sb1.reverse());
		
		/**
		 * Attempts to reduce storage used for the character sequence.
		 */
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		
		
		/**
		 * Removes the characters in a substring of this sequence.
		 */
		System.out.println(sb1.delete(5, 17));
		
		/**
		 * Removes the char at the specified position in this sequence.
		 */
		System.out.println(sb1.deleteCharAt(3));
		
	}

}
