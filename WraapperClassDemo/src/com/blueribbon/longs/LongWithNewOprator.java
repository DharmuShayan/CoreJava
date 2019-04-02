package com.blueribbon.longs;

public class LongWithNewOprator {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Long l1 = new Long(127);
		Long l2 = new Long(127);
		
		System.out.println(l1==l2);
		System.out.println(l1.equals(l2));
		
		Long l3 = new Long(128);
		Long l4 = new Long(128);
		
		System.out.println(l3==l4);
        System.out.println(l3.equals(l4));
        
        
    	Long l5 = new Long(-129);
		Long l6 = new Long(-129);
		
		System.out.println(l5==l6);
        System.out.println(l5.equals(l6));
	}

}
