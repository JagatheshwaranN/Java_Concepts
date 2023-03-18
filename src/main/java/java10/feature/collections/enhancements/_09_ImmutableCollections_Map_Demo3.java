package java10.feature.collections.enhancements;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _09_ImmutableCollections_Map_Demo3 {

	public static void main(String[] args) {

		var map = IntStream.rangeClosed(1, 3).boxed()
				.collect(Collectors.toUnmodifiableMap(Function.identity(), String::valueOf));
		System.out.println(map);
		map.put(4, "4"); // java.lang.UnsupportedOperationException
	}
}
