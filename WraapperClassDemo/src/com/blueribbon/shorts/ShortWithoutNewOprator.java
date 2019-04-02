package com.blueribbon.shorts;

public class ShortWithoutNewOprator {

	public static void main(String[] args) {

		
		Short s3=127;
		Short s4=127;
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		Short s5=128;
		Short s6=128;
		
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
		
		Short s7=-128;
		Short s8=-128;
		
		System.out.println(s7==s8);
		System.out.println(s7.equals(s8));
		
		Short s9=-129;
		Short s10=-129;
		
		System.out.println(s9==s10);
		System.out.println(s9.equals(s10));
	}

}
