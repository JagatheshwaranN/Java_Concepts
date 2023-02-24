package java9.feature.process_api.enhancements;

import java.io.IOException;

/**
 * ProcessBuilder - We can use ProcessBuilder to create Processes.
 * 
 * @author Jagatheshwaran N
 */
public class _04_ProcessBuilder_Demo1 {

	public static ProcessBuilder builder;

	public static void main(String[] args) throws IOException {

		builder = new ProcessBuilder("notepad", "Products.txt");
		builder.start();
		builder = new ProcessBuilder("notepad", "Test.java");
		builder.start();
	}
}
