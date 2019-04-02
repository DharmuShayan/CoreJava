package com.blueribbon.a;

public class VowelCount {

	public static void main(String args[]) {
		String str = new String("Please enter some text");

		char[] letters = str.toCharArray();
		int count = 0;
		for (char c : letters) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
			}
		}
		System.out.println("Number of vowels in String [" + str + "] is : " + count);
	}
}
