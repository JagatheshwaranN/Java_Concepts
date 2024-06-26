package java8.feature.predicate;

import java.util.function.Predicate;

/**
 * Predicate Interface is used for conditional checks.
 * 
 * Represents a predicate (boolean-valued function) of one argument.
 * 
 * interface predicate<T> { public boolean test (T t); }
 * 
 * T - Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class _1_PredicateDemo1 {

	public static void main(String[] args) {

		// Predicate is used to check the given number is odd or even.
		Predicate<Integer> p1 = i -> i % 2 == 0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(15));

		// Predicate is used to check the given string length is greater than 5.
		String value = "JavaProgram";
		Predicate<String> p2 = s -> s.length() > 5;
		System.out.println(p2.test(value));

		// Predicate is used to check the length of the array elements is greater than
		// 4.
		String[] arr = { "apple", "orange", "grapes" };
		Predicate<String> p3 = s1 -> s1.length() > 4;
		for (String ele : arr) {
			if (p3.test(ele)) {
				System.out.println(ele);
			}
		}
	}

}
