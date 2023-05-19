package java19.feature.virtualthread;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * This JEP introduces virtual threads, a lightweight implementation of threads
 * provided by the JDK instead of the OS.
 * 
 * The most exciting innovation in Java 19 for me is "Virtual Threads". Virtual
 * threads have been developed in Project Loom for several years and could only
 * be tested with a self-compiled JDK so far.
 * 
 * The number of virtual threads can be much larger than the number of OS
 * threads. These virtual threads help increase the throughput of the concurrent
 * applications.
 * 
 * @author Jagatheshwaran N
 */
public class _01_VirtualThread_Demo1 {

	public static void main(String[] args) {

		virtualThreadDemo();
		nonVirtualThreadDemo();
	}

	// The below example will run 5k tasks on Virtual Threads, and the modern CPU
	// may take less than 1 second to finish it.
	private static void virtualThreadDemo() {
		try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
			IntStream.range(0, 5000).forEach(n -> {
				executor.submit(() -> {
					try {
						Thread.sleep(Duration.ofSeconds(1));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(n);
				});
			});
		}
	}

	// Try running the above code using the classic newFixedThreadPool, and we may
	// need to manually terminate it because it will take a long time to finish.
	private static void nonVirtualThreadDemo() {
		try (var executor = Executors.newFixedThreadPool(20)) {
			IntStream.range(0, 5000).forEach(n -> {
				executor.submit(() -> {
					try {
						Thread.sleep(Duration.ofSeconds(1));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(n);
				});
			});
		}
	}
}
