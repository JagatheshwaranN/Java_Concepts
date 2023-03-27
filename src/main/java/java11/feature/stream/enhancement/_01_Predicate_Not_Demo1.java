package java11.feature.stream.enhancement;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Java 11 introduced a static new method to Predicate interface as not() to
 * negate an existing predicate similar to negate method.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Predicate_Not_Demo1 {

	public static void main(String[] args) {

		var sampleList = Arrays.asList("java", "\n", "javascript", " ");
		var listWithoutBlankValue = sampleList.stream().filter(Predicate.not(String::isBlank))
				.collect(Collectors.toList());
		System.out.println(listWithoutBlankValue);
	}
}
