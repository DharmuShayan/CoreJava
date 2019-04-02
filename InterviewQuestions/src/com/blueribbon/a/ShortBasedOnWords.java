package com.blueribbon.a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

@SuppressWarnings("unused")
public class ShortBasedOnWords {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		File file = new File("D:\\InterviewQuestions\\StringTokenizerQuestion\\story.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		String line;
		while ((line = reader.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line, ".");

			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				System.out.println(st.countTokens());
				System.out.print(token);
			}
		}

	}
}