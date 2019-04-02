package com.blueribbon.fileReader;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
	
		File file = new File("wr.txt");
		FileReader fr = new FileReader(file);
		int i=fr.read();
		while(i!= -1) {
			System.out.println((char)i);
			fr.read();
		}
	
	}
}
