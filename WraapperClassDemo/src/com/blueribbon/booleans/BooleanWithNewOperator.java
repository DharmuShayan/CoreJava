package com.blueribbon.booleans;

public class BooleanWithNewOperator {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		/**
		 * Boolean​(boolean value)            
		 * Boolean​(String s)               
		 */
		
		Boolean b4 = new Boolean("true");
		Boolean b5 = new Boolean("true");
		Boolean b6 = new Boolean("false");
		Boolean b7 =true;
		Boolean b8 =false;
		
		System.out.println(b4==b5);
		System.out.println(b4.equals(b5));
		
		System.out.println(b4==b6);
		System.out.println(b4.equals(b6));
		
		System.out.println(b4==b7);
		System.out.println(b4.equals(b7));
		System.out.println(b4.equals(b8));
	
	}
	}
