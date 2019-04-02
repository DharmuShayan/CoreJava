package com.blueribbon.removeduplicate;

public class RemoveDuplicateCharacters2 {

	public static void main(String[] args) {

		//String input = "afsjeadrffafvgdefeverhfgberAAad";
		String input = "ddooooonnneeeeee";
		System.out.println(input.replaceAll("(.)\\1{1,}", "$1"));
	}

}
