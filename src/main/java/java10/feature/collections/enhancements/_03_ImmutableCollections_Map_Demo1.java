package java10.feature.collections.enhancements;

import java.util.Collections;
import java.util.HashMap;

public class _03_ImmutableCollections_Map_Demo1 {

	public static void main(String[] args) {

		var map = new HashMap<Integer, String>();
		map.put(1, "Alex");
		map.put(2, "John");
		map.put(3, "Smith");
		var immutableMap = Collections.unmodifiableMap(map);
		System.out.println(immutableMap);
		immutableMap.put(4, "Erica");
	}
}
