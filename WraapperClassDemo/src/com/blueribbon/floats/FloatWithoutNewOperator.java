package com.blueribbon.floats;

public class FloatWithoutNewOperator {

	public static void main(String[] args) {
		
		
		/**
		 * Float even without new operator always a new object will be created 
		 * in Heap memory
		 */
		Float f1 = 10.23f;
		Float f2 = 10.23f;
		Float f3 = 11.23f;
		//Float f4 =10.23;   error
		
		
		
	
		System.out.println(f1==f2);
		System.out.println(f1.equals(f2));
		System.out.println(f1==f3);
		System.out.println(f1.equals(f3));

	}

}
