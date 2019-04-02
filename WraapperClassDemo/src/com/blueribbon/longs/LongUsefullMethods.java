package com.blueribbon.longs;

public class LongUsefullMethods {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Long l1 = (long) 1000;
		Long l2 = (long) 1000;
		String s = "10466789";
		Long l4 = (long) 1000000;

		/**
		 * Returns the value of this Float as a double after a widening primitive
		 * conversion.
		 */
		System.out.println(l1.doubleValue());

		/**
		 * Returns the float value of this Float object.
		 */
		System.out.println(l1.floatValue());

		/**
		 * Returns the value of this Long as a short after a narrowing primitive
		 * conversion.
		 */
		System.out.println(l1.shortValue());

		/**
		 * Adds two Long values together as per the + operator.
		 */
		System.out.println(Double.sum(l1, l2));

		/**
		 * Returns a string representation of this Long object.
		 */
		System.out.println(l2.toString());

		/**
		 * Returns a string representation of the long argument.
		 */
		System.out.println(Long.toString(l2));

		System.out.println(l1.parseLong(s));
		
		System.out.println(Long.reverse(Long.valueOf(s)));
		System.out.println(Long.max(l1, l4));
		System.out.println(Long.min(l1, l4));
		System.out.println(Long.numberOfLeadingZeros(l4));
	}

}
