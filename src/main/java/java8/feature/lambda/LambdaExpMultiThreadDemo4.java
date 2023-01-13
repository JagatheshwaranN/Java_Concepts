package java8.feature.lambda;

public class LambdaExpMultiThreadDemo4 {

	public static void main(String[] args) {

		Runnable reference = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(reference);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread");
		}
	}
}
