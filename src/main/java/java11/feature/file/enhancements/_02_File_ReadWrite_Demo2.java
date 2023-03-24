package java11.feature.file.enhancements;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class _02_File_ReadWrite_Demo2 {

	public static void main(String[] args) throws IOException {

		Path filePath = Files.writeString(Path.of(File.createTempFile("java11FileDemo", ".tmp").toURI()),
				"Java11 File API Enhancements", Charset.defaultCharset(), StandardOpenOption.WRITE);
		String fileContent = Files.readString(filePath);
		System.out.println(fileContent);
	}
}
