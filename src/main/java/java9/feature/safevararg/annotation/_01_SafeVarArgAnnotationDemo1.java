package java9.feature.safevararg.annotation;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * The SafeVarArgs annotation was introduced in the java 1.7 v. SafeVarargs
 * annotation is used to indicate that methods will not cause heap pollution.
 * These methods are considered to be safe.It is available for Constructors,
 * Static Methods, and Final Methods.From java 1.9 v onwards, it will be
 * applicable for Private Methods as well.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _01_SafeVarArgAnnotationDemo1 {

	public static void main(String[] args) {

		List<String> al1 = Arrays.asList("Apple", "Orange");
		List<String> al2 = Arrays.asList("Carrot", "Beans");
		display(al1, al2);
	}

	@SafeVarargs
	private static void display(List<String>... lists) {

		for (List<String> list : lists) {
			System.out.println(list);
		}
		// Using Java8 Streams
		List<List<String>> list1 = Arrays.asList(lists);
		list1.stream().forEach(e -> System.out.println(e));
	}
}
