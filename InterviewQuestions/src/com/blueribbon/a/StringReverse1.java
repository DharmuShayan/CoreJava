package com.blueribbon.a;

public class StringReverse1 {

	public static void main(String[] args) {

		String str=new String("There is nothing permanent except change.");
		
		StringBuilder sb = new StringBuilder(str);
		StringBuilder SB = sb.reverse();
		
		System.out.println(SB);
	}

}
