package processBuilder;

import java.io.IOException;

public class ProcessBuilderDemo {

	public static void main(String[] args) throws IOException {

		ProcessBuilder pb = new ProcessBuilder("notepad.exe",
				"D:\\CoreJava\\Java9NewFeatures\\src\\processHandler\\ProcessHandlerDemo2.java");
		pb.start();

		ProcessBuilder pb1 = new ProcessBuilder("java", "HelloClass");
		pb1.start();

	}
}
