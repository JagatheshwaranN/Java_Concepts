package java9.feature.stream.enhancements;

import java.util.List;
import java.util.stream.Collectors;

public class _01_StreamAPIEnhancement_takeWhile_Demo1 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(2, 4, 8, 1, 6, 9, 10);
		System.out.println("Initial List " + numbers);
		// With filter()
		List<Integer> numbersAfterFilter = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("List after filter " + numbersAfterFilter);
		// With takeWhile
		List<Integer> numbersAfterTakeWhile = numbers.stream().takeWhile(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("List after takewhile " + numbersAfterTakeWhile);
	}
}
