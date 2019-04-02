package fileStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import java.util.stream.Collectors;



public class ReadFileUsingStream {

	public static void main(String[] args) throws IOException {
		
		List<String> file= Files.lines(Paths.get("D:\\Core\\Java-8Exercise\\src\\fileStream\\demo.in"))
				.filter(line->line.length()>0)
				.map(line->line.trim())
				.collect(Collectors.toList());
		System.out.print(file);
	}

}
