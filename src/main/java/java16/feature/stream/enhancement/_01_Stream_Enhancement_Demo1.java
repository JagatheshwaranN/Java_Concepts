package java16.feature.stream.enhancement;

import java.util.Arrays;
import java.util.List;

/**
 * Stream.toList() method is used to convert the stream into unmodifiable list
 * easily.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Stream_Enhancement_Demo1 {

	public static void main(String[] args) {

		List<String> integerAsString = Arrays.asList("1", "2", "3", "4", "5");
		List<Integer> intConversion = integerAsString.stream().map(Integer::parseInt).toList();
		System.out.println(intConversion);

		List<String> names = List.of("John", "Alex", "Blake", "Erica");
		List<String> immutableList = names.stream().filter(e -> e.contains("a")).toList();
		System.out.println(immutableList);
	}
}
