package java9.feature.process_api.enhancements;

/**
 * JDK 9 engineers introduced several enhancements to Process API. By using this
 * updated API, we can write java code to communicate with any processor very
 * easily.
 * 
 * Java improved its Process API in Java 9 version that includes new methods for
 * Process class and two new interfaces ProcessHandle and ProcessHandle.Info.
 * These methods are used to create a new process and get process information
 * like process status, running time, process id, etc. We can also get the
 * current running process and its information.
 * 
 * ProcessHandle(I) : This is a new interface added in java 9. It is used to
 * handle a process.
 * 
 * @author Jagatheshwaran N
 */
public class _01_ProcessHandle_Demo1 {

	public static void main(String[] args) {

		ProcessHandle handle = ProcessHandle.current();
		System.out.println("The PID of JVM instance is " + handle.pid());
	}
}
