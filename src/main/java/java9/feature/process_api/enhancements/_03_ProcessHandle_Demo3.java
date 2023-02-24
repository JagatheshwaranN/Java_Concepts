package java9.feature.process_api.enhancements;

import java.util.Optional;

/**
 * ProcessHandle.Info(I): It is an inner interface, it provides all the
 * information related to a process.
 * 
 * We can get the complete information of a particular process by using
 * ProcessHandle.Info object.
 * 
 * This code is used to get the complete information of the already running
 * process.
 * 
 * @author Jagatheshwaran N
 */
public class _03_ProcessHandle_Demo3 {

	public static void main(String[] args) {

		Optional<ProcessHandle> process = ProcessHandle.of(7364);
		ProcessHandle handle = process.get();
		ProcessHandle.Info processInfo = handle.info();
		System.out.println("Complete Process Information => " + processInfo);
		System.out.println("User                    => " + processInfo.user().get());
		System.out.println("Command                 => " + processInfo.command().get());
		System.out.println("StartTime               => " + processInfo.startInstant().get());
		System.out.println("Total CPU Time Acquired => " + processInfo.totalCpuDuration().get());
	}
}
