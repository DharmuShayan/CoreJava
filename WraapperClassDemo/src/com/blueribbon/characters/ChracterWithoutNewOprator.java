package com.blueribbon.characters;

public class ChracterWithoutNewOprator {

	public static void main(String[] args) {

		Character c1=(char) -108;
		Character c2=(char) -108;
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		
		
		Character c3=127;
		Character c4=127;
		
		System.out.println(c3==c4);
		System.out.println(c3.equals(c4));
		
		Character c5=139;
		Character c6=139;
		
		System.out.println(c5==c6);
		System.out.println(c5.equals(c6));
	}

}
