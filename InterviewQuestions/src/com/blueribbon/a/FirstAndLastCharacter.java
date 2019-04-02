package com.blueribbon.a;

public class FirstAndLastCharacter {

	public static void main(String[] args) {

		String str = "Avengers";

		System.out.println("-- First Character--");
		char ch = str.charAt(0);
		System.out.println(ch);

		System.out.println("-- Last Character--");
		char last = str.charAt(str.length() - 1);
		System.out.println(last);
		
		System.out.println("-- Reverse Order Character--");
		
		for (int i =str.length()-1;i>=0;i--) {
			char reverse = str.charAt(i);
			System.out.print(reverse);
		}
		
	}

}
