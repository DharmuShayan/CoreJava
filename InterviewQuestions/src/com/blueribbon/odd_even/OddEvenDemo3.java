package com.blueribbon.odd_even;

public class OddEvenDemo3 {

	public static void main(String[] args) {
		
	
		for(int i=0;i<20;i++) {
		if ( (i & 1) == 0 ) { 
			System.out.println("Even Numbers:"+i);
		} else { 
			System.out.println("Odd Numbers:"+i); 
			}
		
		}

	}

}
