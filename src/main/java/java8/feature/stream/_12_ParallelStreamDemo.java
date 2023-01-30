package java8.feature.stream;

import java.util.stream.IntStream;

/**
 * Normally any java code has one stream of processing, where it is executed
 * sequentially. Whereas by using parallel streams, we can divide the code into
 * multiple streams that are executed in parallel on separate cores and the
 * final result is the combination of the individual outcomes.
 * 
 * The order of execution is not under the control.
 * 
 * The Parallel Stream can be created using the parallel () and parallelStream
 * () methods.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _12_ParallelStreamDemo {

	static long startTime;
	static long endTime;

	public static void normalStream() {
		startTime = System.currentTimeMillis();
		IntStream.range(1, 20).forEach(x -> {
			System.out.println("Thread - " + Thread.currentThread().getName() + " - " + x);
		});
		endTime = System.currentTimeMillis();
		System.out.println("The time taken by normal stream is " + (endTime - startTime));
	}

	public static void parallelStream() {
		startTime = System.currentTimeMillis();
		IntStream.range(1, 20).parallel().forEach(x -> {
			System.out.println("Thread - " + Thread.currentThread().getName() + " - " + x);
		});
		endTime = System.currentTimeMillis();
		System.out.println("The time taken by parallel stream is " + (endTime - startTime));
	}

	public static void main(String[] args) {

		normalStream();
		parallelStream();
	}
}
