package com.blueribbon.doubles;

public class DoubleWithoutNewOperator {

	public static void main(String[] args) {
		
		
		/**
		 * Double even without new operator always a new object will be created 
		 * in Heap memory
		 */
		Double f1 = 10.23d;
		Double f2 = 10.23;
		Double f3 = 11.23;
		
		
	
		System.out.println(f1==f2);
		System.out.println(f1.equals(f2));
		System.out.println(f1==f3);
		System.out.println(f1.equals(f3));

	}

}
