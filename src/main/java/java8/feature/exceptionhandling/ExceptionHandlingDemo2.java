package java8.feature.exceptionhandling;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * This class contians the exception handling code which is written in L2 level
 * format. It is used to handle the exception if the input type is of different
 * type and may be illegal format.
 * 
 * @author Jagatheshwaran N
 *
 */
public class ExceptionHandlingDemo2 {

	static List<String> list;

	public static void main(String[] args) {

		listWithoutException();
		System.out.println("*************************************************");
		listWithException();
	}

	public static void listWithoutException() {

		list = Arrays.asList("123", "456", "789");
		list.forEach(ExceptionHandlingDemo2::displayList);
	}

	public static void listWithException() {

		list = Arrays.asList("123", "456", "abc");
		list.forEach(ExceptionHandlingDemo2::displayList);
	}

	public static void displayList(String s) {

		try {
			System.out.println(Integer.parseInt(s));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
