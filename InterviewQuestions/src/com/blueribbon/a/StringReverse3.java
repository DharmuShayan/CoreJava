package com.blueribbon.a;

public class StringReverse3 {

	public static void main(String[] args) {

		String str1 = new String(" Hello String");

		for (int i = str1.length() - 1; i >= 0; i--) {
			char c = str1.charAt(i);
			System.out.print(c);

		}
	}

}
