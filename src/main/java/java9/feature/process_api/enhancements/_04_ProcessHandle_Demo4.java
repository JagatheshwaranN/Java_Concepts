package java9.feature.process_api.enhancements;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.Stream;

/**
 * ProcessHandle.Info(I): It is an inner interface, it provides all the
 * information related to a process.
 * 
 * We can get the complete information of a particular process by using
 * ProcessHandle.Info object.
 * 
 * This code is used to get the complete information of all available processes.
 * 
 * @author Jagatheshwaran N
 */
public class _04_ProcessHandle_Demo4 {

	public static void main(String[] args) {

		Stream<ProcessHandle> allProcess = ProcessHandle.allProcesses();
		allProcess.forEach(p -> displayProcessInfo(p));
	}

	public static void displayProcessInfo(ProcessHandle ph) {

		ProcessHandle.Info processInfo = ph.info();
		System.out.println("************************************************************************");
		System.out.println("Complete Process Information of Process Id => " + ph.pid());
		System.out.println("User                    => " + processInfo.user().orElse(""));
		System.out.println("Command                 => " + processInfo.command().orElse(""));
		System.out.println("StartTime               => " + processInfo.startInstant().orElse(Instant.now()));
		System.out.println(
				"Total CPU Time Acquired => " + processInfo.totalCpuDuration().orElse(Duration.ofMillis(0)).toMillis());
	}
}
