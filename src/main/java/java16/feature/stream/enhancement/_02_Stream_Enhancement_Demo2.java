package java16.feature.stream.enhancement;

import java.util.List;
import java.util.stream.Stream;

/**
 * In Java 16, Stream.mapMulti() was introduced as a more efficient, imperative
 * alternative to the declarative flatMap(): While with flatMap(), we specify
 * which data we want to merge, with mapMulti() we implement how to merge this
 * data.
 * 
 * @author Jagatheshwaran N
 */
public class _02_Stream_Enhancement_Demo2 {

	public static void main(String[] args) {

		Stream<List<Integer>> stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
//		List<Integer> list = stream.flatMap(List::stream).toList();
//		System.out.println(list);
		List<Object> list = stream.mapMulti((numbers, consumer) -> numbers.forEach(number -> consumer.accept(number)))
				.toList();
		System.out.println(list);

		List<String> names = List.of("John", "Alex", "Blake", "Erica");
		names.stream().mapMulti((name, consumer) -> consumer.accept(name)).forEach(System.out::println);
	}
}
