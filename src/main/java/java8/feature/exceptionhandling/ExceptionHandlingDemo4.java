package java8.feature.exceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * This class contians the exception handling code which is written in L4 level
 * format. It is used to handle the exception if the input type is of different
 * type and may be illegal format.
 * 
 * @author Jagatheshwaran N
 *
 */
public class ExceptionHandlingDemo4 {

	public static void main(String[] args) {

		listWithNumberFormatException();
		listWithArithmeticException();
	}

	public static void listWithNumberFormatException() {

		List<String> list = Arrays.asList("123", "456", "abc");
		list.forEach(handleException(s -> System.out.println(Integer.parseInt(s)), NumberFormatException.class));
	}

	public static void listWithArithmeticException() {

		List<Integer> list = Arrays.asList(1, 0);
		list.forEach(handleException(s -> System.out.println(10 / s), ArithmeticException.class));
	}

	public static <Target, ExObj extends Exception> Consumer<Target> handleException(Consumer<Target> consumer,
			Class<ExObj> exObjClass) {

		return input -> {
			try {
				consumer.accept(input);
			} catch (Exception ex) {
				try {
					ExObj exObj = exObjClass.cast(ex);
					System.out.println("Exception : " + exObj.getMessage());
				} catch (ClassCastException ccex) {
					throw ccex;
				}
			}
		};
	}
}
