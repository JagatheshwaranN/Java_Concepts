package java9.feature.process_api.enhancements;

import java.io.IOException;
import java.util.Optional;

/**
 * ProcessBuilder - We can use ProcessBuilder to create Processes.
 * 
 * Here we have used ProcessBuilder to get the already running process and to
 * destroy the same.
 * 
 * @author Jagatheshwaran N
 */
public class _08_ProcessBuilder_Demo4 {

	public static ProcessBuilder builder;

	public static void main(String[] args) throws IOException, InterruptedException {

		Optional<ProcessHandle> process = ProcessHandle.of(9640);
		ProcessHandle handle = process.get();
		System.out.println("The process with PID " + handle.pid() + " is started");
		Thread.sleep(10000);
		handle.destroy();
		System.out.println("The process with PID " + handle.pid() + " is destroyed");
	}
}
