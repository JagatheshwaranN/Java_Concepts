package java11.feature.file.enhancements;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Java 11 has introduced an easy way to read and write files by providing new
 * overloaded methods without writing much boiler plate code.
 * 
 * writeString() - This method is used to write some content in a file. Using
 * this method, we can insert some text into file at that location.
 * 
 * readString() - This method is used to read the contents of a file.
 * 
 * @author Jagatheshwaran N
 */
public class _01_File_ReadWrite_Demo1 {

	public static void main(String[] args) throws IOException {

		Files.writeString(Path.of("Java11File.txt"), "This is Java11 File", StandardCharsets.UTF_8,
				StandardOpenOption.WRITE);
		String fileContent = Files.readString(Path.of("Java11File.txt"));
		System.out.println(fileContent);
	}
}
