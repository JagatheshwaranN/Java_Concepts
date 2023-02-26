package java9.feature.process_api.enhancements;

import java.io.IOException;

/**
 * ProcessBuilder - We can use ProcessBuilder to create Processes.
 * 
 * Here we have used ProcessBuilder to run the Java program.
 * 
 * @author Jagatheshwaran N
 */
public class _06_ProcessBuilder_Demo3 {

	public static ProcessBuilder builder;

	public static void main(String[] args) throws IOException, InterruptedException {

		ProcessBuilder builder = new ProcessBuilder("java", "Test.java");
		Process process = builder.start();
		System.out.println("The process with PID " + process.pid() + " is started");
		Thread.sleep(10000);
		process.destroy();
		System.out.println("The process with PID " + process.pid() + " is destroyed");
	}
}
