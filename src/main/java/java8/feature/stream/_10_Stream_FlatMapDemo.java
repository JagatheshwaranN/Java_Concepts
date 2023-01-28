package java8.feature.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * flatMap () is used to perform the transformation and flattering.
 * 
 * It is mapper function produces multiple value for each input value. Hence, it
 * is also called One-To-Many mapping.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _10_Stream_FlatMapDemo {

	public static void main(String[] args) {

		String[][] array = new String[][] { { "1", "2" }, { "3", "4" }, { "5", "6" } };

		List<String> collect = Stream.of(array).flatMap(Stream::of).filter(x -> !"1".equals(x))
				.collect(Collectors.toList());
		collect.forEach(System.out::println);
	}
}
