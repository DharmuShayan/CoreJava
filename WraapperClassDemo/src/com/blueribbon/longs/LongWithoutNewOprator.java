package com.blueribbon.longs;

public class LongWithoutNewOprator {

	public static void main(String[] args) {

		
	    Long l1=(long) 127;
	    Long l2=(long) 127;
		
		System.out.println(l1==l2);
		System.out.println(l1.equals(l2));
		
	    Long l3=(long) 129;
	    Long l4=(long) 129;
		
		System.out.println(l3==l4);
		System.out.println(l3.equals(l4));
		
		
	}

}
