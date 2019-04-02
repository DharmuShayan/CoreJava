package com.blueribbon.fileReader;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
	
		File file = new File("wr.txt");
		
		FileReader fr = new FileReader(file);
		
		char[] ch1=new char[(int) file.length()];
		
		fr.read(ch1);
		for (char c : ch1) {
		     System.out.println(c);
		} 
	}
}
