package com.blueribbon.a;

public class StringContainsExample {

	public static void main(String[] args) {
		
		String str="Hello World";
		
		if (str.indexOf("World") != -1) {
			System.out.println("Yes:"+ str);
		}

		
		if (str.contains("Hello")) {
			System.out.println("Yes:"+ str);
		}
		
		if (str.matches("(.*)World")) {
			System.out.println("Yes:"+ str);
		}
	}

}
