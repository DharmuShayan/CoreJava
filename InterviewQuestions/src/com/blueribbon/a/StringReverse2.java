package com.blueribbon.a;

public class StringReverse2 {

	public static void main(String[] args) {

		String str=new String("State Bank Of India");
		System.out.println(str);
		char[] a = str.toCharArray();
		for (int i = a.length-1; i>=0; i--) {

			System.out.print(a[i]);
		}
	
	}

}
