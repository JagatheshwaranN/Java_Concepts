package java9.feature.stream.enhancements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _06_StreamAPIEnhancement_OfNullable_Demo3 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("A", "Apple");
		map.put("B", "Banana");
		map.put("C", "");
		map.put("D", "DragonFruit");
		map.put("E", "");
		List<String> keys = map.entrySet().stream().map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println("Keys of Map " + keys);
		List<String> values = map.entrySet().stream().flatMap(e -> Stream.ofNullable(e.getValue()))
				.collect(Collectors.toList());
		System.out.println("Values of Map " + values);
	}
}
