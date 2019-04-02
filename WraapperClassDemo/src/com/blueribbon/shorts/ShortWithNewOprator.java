package com.blueribbon.shorts;

public class ShortWithNewOprator {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Short b1 = new Short("127");
		Short b2 = new Short("127");
		
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		
		Short b5 = new Short("12");
		Short b6 = new Short("12");
		
		System.out.println(b5==b6);
		System.out.println(b5.equals(b6));
		
		Short b3 = new Short("-129");
		Short b4 = new Short("-129");
		
		System.out.println(b3==b4);
		System.out.println(b3.equals(b4));
		
	
	}

}
