package com.blueribbon.ints;

public class IntegerWithNewOprator {

	public static void main(String[] args) {

		Integer i1 = 127;
		Integer i2 = 127;

		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));

		Integer i3 = -128;
		Integer i4 = -128;

		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));

		Integer i5 = -129;
		Integer i6 = -129;

		System.out.println(i5==i6);
		System.out.println(i5.equals(i6));
		
		Integer i7 = 128;
		Integer i8 = 128;
		
		System.out.println(i7==i8);
		System.out.println(i7.equals(i8));

	}

}
