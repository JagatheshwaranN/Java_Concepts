package java8.feature.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ProductSkipLimitDemo {

	public static List<String> fileData;

	public static void printFileDataWithoutSkipLimit() throws IOException {

		fileData = Files.readAllLines(Paths.get("Products.txt"));
		fileData.stream().forEach(System.out::println);
	}

	public static void printFileDataWithSkipLimit() throws IOException {

		fileData = Files.readAllLines(Paths.get("Products.txt"));
		fileData.stream().skip(1).limit(fileData.size() - 2).forEach(System.out::println);
	}

	public static void main(String[] args) throws IOException {

		printFileDataWithoutSkipLimit();
		System.out.println("*************************************************");
		printFileDataWithSkipLimit();
	}
}
