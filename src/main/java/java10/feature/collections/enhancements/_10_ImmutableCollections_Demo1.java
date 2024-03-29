package java10.feature.collections.enhancements;

import java.util.ArrayList;
import java.util.Collections;

public class _10_ImmutableCollections_Demo1 {

	public static void main(String[] args) {

		var list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		var immutableCollections = Collections.unmodifiableCollection(list);
		System.out.println(immutableCollections);
		immutableCollections.add(4);
	}
}
