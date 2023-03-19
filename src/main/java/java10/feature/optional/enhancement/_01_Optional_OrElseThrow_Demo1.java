package java10.feature.optional.enhancement;

import java.util.List;
import java.util.Optional;

/**
 * As part of Java 10, a nice solution with the method OrElseThrow(). This
 * method is an exact copy of the get() method only with the difference in name.
 * It is clear from the method name that it will throw an exception.
 * 
 * It is applicable for Integer, Double, Long and Float.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Optional_OrElseThrow_Demo1 {

	public static void main(String[] args) {

		// With Non-Empty List
		List<Integer> list1 = List.of(1, 2, 3, 4, 5);
		Optional<Integer> firstEvenNum1 = Optional.of(list1.stream().filter(i -> i % 2 == 0).findFirst().orElseThrow());
		System.out.println(firstEvenNum1);

		// With Empty List
		List<Integer> list2 = List.of();
		Optional<Integer> firstEvenNum2 = Optional.of(list2.stream().filter(i -> i / 2 == 0).findFirst().orElseThrow());
		System.out.println(firstEvenNum2);
	}
}
