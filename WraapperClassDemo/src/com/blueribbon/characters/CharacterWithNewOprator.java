package com.blueribbon.characters;

public class CharacterWithNewOprator {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {


		Character c1 = new Character('a');
		Character c2 = new Character('a');
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		
		Character c3 = new Character('A');
		Character c4 = new Character('A');
		
		System.out.println(c3==c4);
		System.out.println(c3.equals(c4));
	
	}

}
