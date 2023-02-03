package java8.feature.exceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingDemo5 {

	public static void main(String[] args) {

		listWithDefaultCheckedException();
		System.out.println("*************************************************");
		listWithHandledCheckedException();
	}

	public static void listWithDefaultCheckedException() {

		List<Integer> list = Arrays.asList(10, 20);
		list.forEach(i -> {
			try {
				Thread.sleep(i);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}

	public static void listWithHandledCheckedException() {

		List<Integer> list = Arrays.asList(10, 20);
		list.forEach(handleCheckedException(i -> {
			Thread.sleep(i);
			System.out.println(i);
		}));
	}

	public static <Target> Consumer<Target> handleCheckedException(
			CheckedExceptionHandler<Target, Exception> consumerHandler) {
		return input -> {
			try {
				consumerHandler.accept(input);
			} catch (Exception ex) {
				throw new RuntimeException(ex);
			}
		};
	}
}
