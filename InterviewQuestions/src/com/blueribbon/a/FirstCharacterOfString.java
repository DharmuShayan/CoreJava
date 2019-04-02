package com.blueribbon.a;

import java.util.StringTokenizer;

public class FirstCharacterOfString {

	public static void main(String[] args) {

		String str=new String("State Bank Of India");
		
		StringTokenizer st = new StringTokenizer(str);
		
		while (st.hasMoreTokens()) {
			String ss = st.nextToken();
			char[] a = ss.toCharArray();
			System.out.print(a[0]);
		}
	
	}

}
