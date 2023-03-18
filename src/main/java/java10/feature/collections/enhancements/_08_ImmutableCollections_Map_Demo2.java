package java10.feature.collections.enhancements;

import java.util.HashMap;
import java.util.Map;

public class _08_ImmutableCollections_Map_Demo2 {

	public static void main(String[] args) {

		var map = new HashMap<Integer, String>();
		map.put(1, "Alex");
		map.put(2, "John");
		map.put(3, "Smith");
		var immutableMap = Map.copyOf(map);
		System.out.println(immutableMap);
		immutableMap.put(4, "Erica");
	}
}
