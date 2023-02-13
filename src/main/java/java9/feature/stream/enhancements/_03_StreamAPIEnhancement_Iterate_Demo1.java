package java9.feature.stream.enhancements;

import java.util.stream.Stream;

/**
 * 
 * It is the static method present in the Stream interface.
 * 
 * public static Stream iterate (T initial, Predicate condition Check,
 * UnaryOperator<T> f)
 * 
 * This method takes an initial value, predicate to terminate and function that
 * provides next value.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _03_StreamAPIEnhancement_Iterate_Demo1 {

	public static void main(String[] args) {

		// Generate Numbers - Java 1.8 - The problem with 2 arguments iterate () method
		// is there may be chance of infinite loop.
		Stream.iterate(1, n -> n + 2).limit(5).forEach(System.out::print);
		System.out.println();
		// Conditional Check - Java 1.9
		Stream.iterate(1, x -> x < 10, x -> x + 2).forEach(System.out::println);
	}
}