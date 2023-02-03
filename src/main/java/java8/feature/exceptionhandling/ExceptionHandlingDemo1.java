package java8.feature.exceptionhandling;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * This class contians the exception handling code which is written in L1 level
 * format. It is used to handle the exception if the input type is of different
 * type and may be illegal format.
 * 
 * @author Jagatheshwaran N
 *
 */
public class ExceptionHandlingDemo1 {

	static List<String> list;

	public static void listWithoutException() {

		list = Arrays.asList("123", "456", "789");
		list.forEach(s -> {
			try {
				System.out.println(Integer.parseInt(s));
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		});
	}

	public static void listWithException() {

		list = Arrays.asList("123", "456", "abc");
		list.forEach(s -> {
			try {
				System.out.println(Integer.parseInt(s));
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		});
	}

	public static void main(String[] args) {

		listWithoutException();
		System.out.println("*************************************************");
		listWithException();
	}
}
