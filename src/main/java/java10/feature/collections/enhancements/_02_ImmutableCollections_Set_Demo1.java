package java10.feature.collections.enhancements;

import java.util.Collections;
import java.util.HashSet;

public class _02_ImmutableCollections_Set_Demo1 {

	public static void main(String[] args) {

		var set = new HashSet<String>();
		set.add("apple");
		set.add("orange");
		set.add("mango");
		var immutableSet = Collections.unmodifiableSet(set);
		System.out.println(immutableSet);
		immutableSet.add("grapes");
	}
}
