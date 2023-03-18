package java10.feature.collections.enhancements;

import java.util.HashSet;
import java.util.Set;

public class _05_ImmutableCollections_Set_Demo2 {

	public static void main(String[] args) {

		var set = new HashSet<String>();
		set.add("apple");
		set.add("orange");
		set.add("mango");
		var immutableSet = Set.copyOf(set);
		System.out.println(immutableSet);
		immutableSet.add("grapes");
	}
}
