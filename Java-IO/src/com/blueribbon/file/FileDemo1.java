package com.blueribbon.file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		File file = new File("abc.txt");
		System.out.println(file.exists()); //false
		file.createNewFile();
		System.out.println(file.exists());  //true
	}

}
