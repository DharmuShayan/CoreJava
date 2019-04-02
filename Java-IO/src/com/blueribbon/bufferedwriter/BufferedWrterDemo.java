package com.blueribbon.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrterDemo {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("writer.txt"));
		bw.write("Hello world");
		bw.newLine();
		bw.write("GoodMorning");
		
		bw.flush();
		bw.close();
	}
}
