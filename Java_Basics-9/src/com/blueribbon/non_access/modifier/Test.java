package com.blueribbon.non_access.modifier;

public class Test {
	static int a = 10;
    static int b=90;
	 static void m1() {
		System.out.println("Test class Static method "+a);
	}
	 
	 static {
		 System.out.println("Test class Static method "+b); 
	 }
}
