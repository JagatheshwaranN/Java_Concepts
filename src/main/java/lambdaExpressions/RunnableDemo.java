package lambdaExpressions;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable with Anonymous Class - " + Thread.currentThread().getName() + " is running");
	}

	public static void main(String ar[]) {

		Runnable r1 = new RunnableDemo();

		Runnable r2 = () -> {
			System.out.println("Runnable with Lambda expression - " + Thread.currentThread().getName() + " is running");
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		t1 = null;
		t2 = null;

	}
}
