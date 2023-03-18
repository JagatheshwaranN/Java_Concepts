package java10.feature.collections.enhancements;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * In Java 10, The Stream APIs Collectors created using the
 * Collectors.toUnmodifiableList(), Collectors.toUnmodifiableSet() and
 * Collectors.toUnmodifiableMap() allows stream elements to get collect into
 * immutable lists, sets and maps.
 * 
 * @author Jagatheshwaran N
 */
public class _03_ImmutableCollections_List_Demo3 {

	public static void main(String[] args) {

		var list = IntStream.rangeClosed(1, 3).boxed().collect(Collectors.toUnmodifiableList());
		System.out.println(list);
		list.add(4); // java.lang.UnsupportedOperationException
	}
}
