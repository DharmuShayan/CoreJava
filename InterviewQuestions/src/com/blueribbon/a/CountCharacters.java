package com.blueribbon.a;

public class CountCharacters {

	public static void main(String args[]) {

		String str = "Hello World";
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)== 'l') {
				res++;
			}
		}
		System.out.println(res);
	}

}
