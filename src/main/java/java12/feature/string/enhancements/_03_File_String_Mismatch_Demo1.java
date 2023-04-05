package java12.feature.string.enhancements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * mismatch() - You can use the Files.mismatch() method to compare the contents
 * of two files. The method returns -1 if both files are the same. Otherwise, it
 * returns the position of the first byte at which both files differ. If one of
 * the files ends before a difference is detected, the length of that file is
 * returned.
 * 
 * @author Jagatheshwaran N
 */
public class _03_File_String_Mismatch_Demo1 {

	public static void main(String[] args) throws IOException {

		verifyIdenticalFiles();
		verifyDifferentFiles();
	}

	private static void verifyIdenticalFiles() throws IOException {

		Path path1 = Files.createTempFile("file1", ".txt");
		Path path2 = Files.createTempFile("file2", ".txt");
		Files.writeString(path1, "Java 12 Features");
		Files.writeString(path2, "Java 12 Features");
		System.out.println(Files.mismatch(path1, path2));
	}

	private static void verifyDifferentFiles() throws IOException {

		Path path1 = Files.createTempFile("file1", ".txt");
		Path path2 = Files.createTempFile("file2", ".txt");
		Files.writeString(path1, "Java 12 Article");
		Files.writeString(path2, "Java 12 Features");
		System.out.println(Files.mismatch(path1, path2));
	}
}
