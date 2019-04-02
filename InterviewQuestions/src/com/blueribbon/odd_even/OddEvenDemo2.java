package com.blueribbon.odd_even;

public class OddEvenDemo2 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 20; i++) {
			
			if ((i/2)*2==i) {
				System.out.println("Number is Even:"+i);
				//System.out.println("Number is ODD:"+i);
			}else {
				System.out.println("Number is ODD:"+i);
			}
				
			
		}

	}

}
