package com.blueribbon.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("wr.txt",true);
               fw.write(100);
               fw.write("Hello world");
               
               char[] ch1= {'a','b','c','f'};
               
               fw.write("\n");
               fw.write(ch1);
               System.out.println(fw.toString());
               fw.flush();
               fw.close();    
	}
}
