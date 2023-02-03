package java8.feature.exceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * This class contians the exception handling code which is written in L3 level
 * format. It is used to handle the exception if the input type is of different
 * type and may be illegal format.
 * 
 * @author Jagatheshwaran N
 *
 */
public class ExceptionHandlingDemo3 {

	static List<String> list;

	public static void main(String[] args) {

		listWithException();
	}

	public static void listWithException() {

		list = Arrays.asList("123", "456", "abc");
		list.forEach(handleException(s -> System.out.println(Integer.parseInt(s))));
	}

	public static Consumer<String> handleException(Consumer<String> consumer) {

		return input -> {
			try {
				consumer.accept(input);
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		};
	}
}
