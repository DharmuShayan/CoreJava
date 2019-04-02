package com.blueribbon.floats;

public class FloatWithNewOperator {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Float f1 = new Float(10.23f);
		Float f2 = new Float(10.23f);
		Float f3 = new Float(11.23f);
		Float f4 = new Float(10.23);
		Float f5 =10.23f;
		
		
		System.out.println(f1==f5);
		System.out.println(f1.equals(f5));
		System.out.println(f1==f2);
		System.out.println(f1.equals(f2));
		System.out.println(f1==f3);
		System.out.println(f1.equals(f3));
		System.out.println(f1==f4);
		System.out.println(f1.equals(f4));
	}

}
