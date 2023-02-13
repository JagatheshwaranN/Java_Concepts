package java9.feature.stream.enhancements;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * It is the default method present in the Stream interface.
 * 
 * default Stream takeWhile (Predicate p)
 * 
 * takeWhile () method check until the condition is true. i.e., takeWhile()
 * takes elements from stream as long as predicate returns true. If predicate
 * returns false, at that point onwards remaining elements won’t be processed,
 * i.e., rest of the stream is discarded.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _01_StreamAPIEnhancement_TakeWhile_Demo1 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(2, 4, 8, 1, 6, 9, 10);
		System.out.println("Initial List " + numbers);
		// With filter()
		List<Integer> numbersAfterFilter = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("List after filter " + numbersAfterFilter);
		// With takeWhile()
		List<Integer> numbersAfterTakeWhile = numbers.stream().takeWhile(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("List after takewhile " + numbersAfterTakeWhile);
	}
}
