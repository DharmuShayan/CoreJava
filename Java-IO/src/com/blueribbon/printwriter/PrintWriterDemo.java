package com.blueribbon.printwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("hello.txt")));

		pw.write(100);
		pw.println("100");
		pw.println("Hello");
		pw.flush();
		pw.close();
	}
}
