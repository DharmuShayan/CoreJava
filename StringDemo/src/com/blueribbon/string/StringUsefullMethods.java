package com.blueribbon.string;

public class StringUsefullMethods {

	public static void main(String[] args) {

		String s1 = new String("dharmendra");
		String s2 = new String("Dharmu");
		String s3 = "Karnataka floods: Rescue work in Kodagu enters final stage; the specified character, starting the search at the specified index.";

		/**
		 * Returns the string representation of the Object argument.
		 */
		System.out.println(String.valueOf(s2));

		/**
		 * Returns the char value at the specified index.
		 */
		System.out.println(s1.charAt(2));

		/**
		 * Returns the index within this string of the first occurrence of the specified
		 * character.
		 */
		System.out.println(s1.indexOf('a'));

		/**
		 * Returns the index within this string of the first occurrence of the specified
		 * character, starting the search at the specified index.
		 */
		System.out.println(s1.indexOf('a', 3));

		/**
		 * Returns the index within this string of the first occurrence of the specified
		 * substring.
		 */
		System.out.println(s3.indexOf("work"));

		/**
		 * Splits this string around matches of the given regular expression.
		 */
		String[] s = s3.split(":|;|,");
		for (String c : s)
			System.out.println(c);

		/**
		 * Converts this string to a new character array.
		 */
		char[] ch = s3.toCharArray();
		for (char c : ch) {
			System.out.print(c +"\n");
		}
		
	}

}
