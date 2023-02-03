package java8.feature.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Skip operation is useful when we want to discard some elements from
 * actual collection.
 * 
 * Limit operation is useful when we want to limit the number of elements from
 * actual collection.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _13_Stream_Skip_Limit_Demo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.stream().skip(1).limit(8).forEach(System.out::println);
	}
}
