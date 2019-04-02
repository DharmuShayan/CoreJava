package com.blueribbon.doubles;

public class DoebleUsefullMethods {

	public static void main(String[] args) {
		
		Double f1=10.23d;
		Double f2=20.23d;
		String f3="10";
		
		/**
		 * Returns the value of this Float as a double 
		 * after a widening primitive conversion.
		 */	
		System.out.println(f1.doubleValue());
		
		/**
		 * Returns the float value of this Float object.
		 */
		System.out.println(f1.floatValue());
		
		/**
		 * Returns true if this Float value is a Not-a-Number (NaN), false otherwise
		 */
		System.out.println(f1.isNaN());
		/**
		 * Returns the greater of two float values as if by calling Math.max.
		 */
		System.out.println(Double.max(f1, f2));
		System.out.println(Math.max(f1, f2));
		
		/**
		 * Returns the smaller of two float values as if by calling Math.max.
		 */
		System.out.println(Double.min(f1, f2));
		System.out.println(Math.min(f1, f2));
		
		/**
		 * Returns the value of this Float as a short after 
		 * a narrowing primitive conversion.
		 */
		System.out.println(f1.shortValue());
		
		/**
		 * Adds two float values together as per the + operator.
		 */
		System.out.println(Double.sum(f1, f2));
		
		/**
		 *Returns a string representation of this Float object.
		 */
		System.out.println(f3.toString());
		
		/**
		 * Returns a string representation of the float argument.
		 */
		System.out.println(Double.toString(f2));
		
		/**
		 * Returns a Float instance representing the specified float value.
		 */
		System.out.println(Double.valueOf(f1));
		
		/**
		 * Returns a Float object holding the float value represented by the argument string s.
		 */
		
		System.out.println(Double.valueOf(f3));
		
		/**
		 * Returns a new float initialized to the value represented by 
		 * the specified String, as performed by the valueOf method of class Float
		 */
		System.out.println(Double.parseDouble(f3));
		
		
		
		
		
	}

}
