package com.blueribbon.non_access.modifier;

public class ReferenceFinalVariablesdemo {

	public static void main(String[] args) {

		// a final reference variable sb
		final StringBuffer sb = new StringBuffer("Hell");
		System.out.println(sb);

		// changing internal state of object
		// reference by final reference variable sb
		sb.append("o");
		
		System.out.println(sb);
	}
}
