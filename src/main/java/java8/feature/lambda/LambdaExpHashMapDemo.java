package java8.feature.lambda;

import java.util.HashMap;
import java.util.Map;

public class LambdaExpHashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Alex");
		map.put(102, "Blake");
		map.put(103, "Cathy");
		map.put(104, "Daric");
		map.put(105, "Emma");

		// Without Stream
		map.forEach((key, value) -> System.out.println(key + " " + value));

		// With Stream
		map.entrySet().stream().forEach(System.out::println);

		// With Stream applied with filter condition
		map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(System.out::println);
	}
}
