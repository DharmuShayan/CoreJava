package com.blueribbon.characters;

public class ChracterUsefullMethods {

	public static void main(String[] args) {
		
		Character c1=100;
		
		
		Character c3='b';
		
		/**
		 * Determines the number of char values needed to represent the specified character.
		 */
		System.out.println(Character.charCount(c3));
		
		/**
		 * Returns the value of this Character object.
		 */
		System.out.println(c1.charValue());
		
		/**
		 * Returns the int value that the specified Unicode character represents.
		 */
		System.out.println(Character.getNumericValue(c3));
		

	}

}
