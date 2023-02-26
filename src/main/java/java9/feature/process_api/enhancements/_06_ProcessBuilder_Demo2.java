package java9.feature.process_api.enhancements;

import java.io.IOException;

/**
 * ProcessBuilder - We can use ProcessBuilder to create Processes.
 * 
 * Here we have used ProcessBuilder to run the Java program.
 * 
 * @author Jagatheshwaran N
 */
public class _06_ProcessBuilder_Demo2 {

	public static ProcessBuilder builder;

	public static void main(String[] args) throws IOException {

		ProcessBuilder builder = new ProcessBuilder("java", "Test.java");
		builder.start();
	}
}
