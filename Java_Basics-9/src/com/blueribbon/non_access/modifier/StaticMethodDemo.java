package com.blueribbon.non_access.modifier;

public class StaticMethodDemo {
	
	
	public static void main(String[] args) {
		
		Test.m1();
         m1();
	}
	private static void m1() {
		
		System.out.println("StaticMethodDemo class static method");	
		m2();
	
	}
	
	private static void m2() {
		System.out.println("StaticMethodDemo class static method m2");	
	}
}
