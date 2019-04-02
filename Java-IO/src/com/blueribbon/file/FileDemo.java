package com.blueribbon.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("folder");
		file.mkdir();
		File file1 = new File("folder","abc.txt");
	
		//file1.createNewFile();
	    System.out.println(file1.createNewFile());
	    System.out.println(file1.length());
	}
}
