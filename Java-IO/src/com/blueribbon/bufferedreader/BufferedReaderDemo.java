package com.blueribbon.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new FileReader("writer.txt"));
//		int read = br.read();
//		System.out.println((char)read);
		@SuppressWarnings("unused")
		Stream<String> lines = br.lines();
		String readLine = br.readLine();
		
		while (readLine!=null) {
			
			System.out.println(readLine);
			readLine=br.readLine();
		}
		
		br.close();
	}

}
