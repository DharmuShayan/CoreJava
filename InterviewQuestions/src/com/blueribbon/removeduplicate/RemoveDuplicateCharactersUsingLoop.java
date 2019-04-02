package com.blueribbon.removeduplicate;

import java.util.HashSet;

public class RemoveDuplicateCharactersUsingLoop {

	public static void main(String[] args) {

		String stringWithDuplicates = "afsjeadrffafvgdefeverhfgberAAad";
		char[] characters = stringWithDuplicates.toCharArray();
		
		HashSet<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		
		System.out.println("String with duplicates : " + stringWithDuplicates);
		for (int i = 0; i < characters.length; i++) {
			
			if (!set.contains(characters[i])) {
				set.add(characters[i]);
			    sb.append(characters[i]);
			}
		}
		System.out.println("String after duplicates removed : " + sb.toString());
 }
}