package java8.feature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 
 * Reduce operation applies a binary operator to each element in the stream
 * where the first argument to the operator is the return value of the previous
 * application and second argument is the current stream element.
 * 
 * Reduce aggregate the data which means combine elements of a stream and
 * produces a single value.
 *
 * @author Jagatheshwaran N
 *
 */
public class _11_StreamReduceDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Scenario 1 - Approach 1
		Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);

		// Scenario 1 - Approach 2
		Optional<Integer> sum1 = numbers.stream().reduce(Integer::sum);
		System.out.println(sum1);

		// Scenario 2 - Approach 1
		Integer max = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(max);

		// Scenario 2 - Approach 2
		max = numbers.stream().reduce(Integer::max).get();
		System.out.println(max);
	}
}
