package com.blueribbon.a;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordSearcher {

	public static void main(String[] args) {

	

		String str = "This is my First Number number Number";

		List<String> list = Arrays.asList(str.split("\\s"));

		Set<String> uniqNum = new HashSet<String>(list);
		for (String words : uniqNum) {

			System.out.println(words + ":" + Collections.frequency(list, words));
		}

	}
}