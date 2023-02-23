package java9.feature.process_api.enhancements;

/**
 * ProcessHandle.Info(I): It is an inner interface, it provides all the
 * information related to a process.
 * 
 * We can get the complete information of a particular process by using
 * ProcessHandle.Info object.
 * 
 * @author Jagatheshwaran N
 */
public class _02_ProcessHandle_Demo2 {

	public static void main(String[] args) {

		ProcessHandle handle = ProcessHandle.current();
		ProcessHandle.Info processInfo = handle.info();
		System.out.println("Complete Process Information => " + processInfo);
		System.out.println("User                    => " + processInfo.user().get());
		System.out.println("Command                 => " + processInfo.command().get());
		System.out.println("StartTime               => " + processInfo.startInstant().get());
		System.out.println("Total CPU Time Acquired => " + processInfo.totalCpuDuration().get());
	}
}
