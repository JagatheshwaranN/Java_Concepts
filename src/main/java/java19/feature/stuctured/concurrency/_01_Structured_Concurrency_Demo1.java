package java19.feature.stuctured.concurrency;

import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Structured Concurrency developed in Project Loom and initially released as an
 * incubator feature in Java 19 with JDK Enhancement Proposal 428 is the
 * so-called "Structured Concurrency."
 * 
 * When a task consists of several subtasks that can be processed in parallel,
 * Structured Concurrency allows us to implement this in a particularly readable
 * and maintainable way.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Structured_Concurrency_Demo1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		_01_Structured_Concurrency_Demo1 obj = new _01_Structured_Concurrency_Demo1();
		ResultSet result1 = obj.handleUnstructuredAPI();
		System.out.println(result1.x);
		System.out.println(result1.y);
		ResultSet result2 = obj.handleStructuredAPI();
		System.out.println(result2.x);
		System.out.println(result2.y);
	}

	record ResultSet(String x, int y) {
	}

	private String findUser() throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(1));
		return "John";
	}

	private Integer fetchOrder() throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(1));
		return 1;
	}

	/*
	 * The Future tasks findUser() and fetchOrder() execute concurrency, and each
	 * task can succeed or fail (throw exception) independently.
	 * 
	 * If findUser() throws an exception, the fetchOrder() will continue running it,
	 * wasting resources.
	 * 
	 * If fetchOrder() throws an exception, the findUser() will continue running it,
	 * wasting resources.
	 * 
	 * Assume findUser() takes 1 minute to finish, and the fetchOrder() is failed
	 * immediately, but we have no ways to tell handle() to stop or cancel the
	 * entire handle() process, the handle() will still wait 1 minute to process it.
	 */
	ResultSet handleUnstructuredAPI() throws InterruptedException, ExecutionException {
		try (var executor = Executors.newFixedThreadPool(10)) {
			Future<String> user = executor.submit(this::findUser);
			Future<Integer> order = executor.submit(this::fetchOrder);
			String theUser = user.get();
			int theOrder = order.get();
			return new ResultSet(theUser, theOrder);
		}
	}

	/*
	 * This JEP introduces Structured Concurrency API StructuredTaskScope, which
	 * treats multiple tasks running in different threads as a single unit of work.
	 * 
	 * The StructuredTaskScope.ShutdownOnFailure() means if either the findUser() or
	 * fetchOrder() fails, the other will cancel if it has not yet been completed.
	 * 
	 * The StructuredTaskScope is in incubator module, and we can compile and run
	 * the program with the below commands.
	 * 
	 * javac --release XX --enable-preview --add-modules jdk.incubator.concurrent
	 * Main.java
	 * 
	 * java --enable-preview --add-modules jdk.incubator.concurrent Main
	 */

	ResultSet handleStructuredAPI() {	
//		try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
//		Future<String> user = scope.fork(this::findUser);
//		Future<Integer> order = scope.fork(this::fetchOrder);
//		scope.join();
//		scope.throwIfFailed();
//		return new ResultSet(user.resultNow(), order.resultNow());
//	}
		return new ResultSet("Test",1);
	}
}
