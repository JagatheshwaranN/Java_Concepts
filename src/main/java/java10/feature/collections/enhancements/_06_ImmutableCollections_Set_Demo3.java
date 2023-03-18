package java10.feature.collections.enhancements;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _06_ImmutableCollections_Set_Demo3 {

	public static void main(String[] args) {

		var set = IntStream.rangeClosed(1, 3).boxed().collect(Collectors.toUnmodifiableSet());
		System.out.println(set);
		set.add(4); // java.lang.UnsupportedOperationException
	}
}
