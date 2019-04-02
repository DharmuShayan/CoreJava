package com.blueribbon.file;

import java.io.File;

public class NumbersOfFilesInADirecctory {
	public static void main(String[] args) {
		File file = new File("D:\\School");
		String[] no = file.list();
		for (String i : no)
			System.out.println(i);
	}
}
