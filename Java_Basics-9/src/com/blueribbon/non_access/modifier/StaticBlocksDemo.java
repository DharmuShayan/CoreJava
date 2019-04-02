package com.blueribbon.non_access.modifier;

public class StaticBlocksDemo {
	
	
	static int a = 100;
	static int b;
	static {
		System.out.println("Static block initialized.");
		b=a*4;
		//b=68;
		
	}
	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
		System.out.println(Test.b);
	}
}
