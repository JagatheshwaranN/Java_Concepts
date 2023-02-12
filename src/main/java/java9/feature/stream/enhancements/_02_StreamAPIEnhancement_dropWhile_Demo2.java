package java9.feature.stream.enhancements;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * It is the default method present in the Stream interface.
 * 
 * default Stream dropWhile (Predicate p)
 * 
 * It is the opposite of the takeWhile () method. It drops the elements instead
 * of taking them as long as predicate returns true. Once predicate returns
 * false then rest of the Stream will be returned.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _02_StreamAPIEnhancement_dropWhile_Demo2 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(2, 4, 8, 1, 6, 9, 10);
		System.out.println("Initial List " + numbers);
		List<Integer> numbersAfterDropWhile = numbers.stream().dropWhile(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("List after dropwhile " + numbersAfterDropWhile);
	}
}
