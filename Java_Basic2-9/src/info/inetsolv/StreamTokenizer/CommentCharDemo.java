package info.inetsolv.StreamTokenizer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class CommentCharDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {

		FileReader reader = new FileReader("test.txt");
		BufferedReader bufferread = new BufferedReader(reader);
		StreamTokenizer token = new StreamTokenizer(bufferread);

		
	}

}
