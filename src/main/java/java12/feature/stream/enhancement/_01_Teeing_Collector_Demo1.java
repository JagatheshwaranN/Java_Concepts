package java12.feature.stream.enhancement;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A new teeing collector was introduced in Java 12 as an addition to the
 * Collectors class. It is a composite of two downstream collectors. Every
 * element is processed by both downstream collectors. Then their results are
 * passed to the merge function and transformed into the final result. It is the
 * new collector utility introduced in the Streams API. This collector has three
 * arguments - Two collectors and a Bi-function. All input values are passed to
 * each collector and the result is available in the Bi-function. A teeing
 * collector has been exposed as a static method Collectors::teeing. This
 * collector forwards its input to two other collectors before merging their
 * results with a function. teeing(Collector, Collector, BiFunction) accepts two
 * collectors and a function to merge their results.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _01_Teeing_Collector_Demo1 {

	public static void main(String[] args) {

		Stream<Integer> numbers = new Random().ints(100).boxed();
		long range = numbers.collect(Collectors.teeing(Collectors.minBy(Integer::compareTo),
				Collectors.maxBy(Integer::compareTo), (min, max) -> (long) max.orElseThrow() - min.orElseThrow()));
		System.out.println(range);
	}
}
