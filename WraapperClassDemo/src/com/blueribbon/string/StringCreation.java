package com.blueribbon.string;

/**
 * The String class represents character strings.
 * String objects are immutable they can be shared.
 * their values cannot be changed after they are created.
 *Strings are not Thread-safe
 */
public class StringCreation {

	public static void main(String[] args) {

		String str=new String("dharmu");
		StringBuffer sb=new StringBuffer("dharmu");
		String st="dharmu";
		String st1="dharmu";
		
		System.out.println(str==st);//false
		System.out.println(st.equals(str));//true
		System.out.println(str.equals(sb));//false
		System.out.println(str.contentEquals(sb));//true
		
		System.out.println(str.hashCode());
		System.out.println(st1.hashCode());
	}

}
