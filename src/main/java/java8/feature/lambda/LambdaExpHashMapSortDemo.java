package java8.feature.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LambdaExpHashMapSortDemo {

	public static List<Entry<Integer, String>> mapDataAsList() {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Alex");
		map.put(102, "Clare");
		map.put(103, "Bob");
		map.put(104, "Daric");
		map.put(105, "Emma");

		List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
		return entries;
	}

	public static void sortUsingTraditionalCollection() {

		List<Entry<Integer, String>> data = mapDataAsList();
		Collections.sort(data, new Comparator<Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// return o1.getValue() - o2.getValue();
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		for (Entry<Integer, String> entry : data) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void sortUsingCollectionWithLambda() {

		List<Entry<Integer, String>> data = mapDataAsList();
		Collections.sort(data, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		for (Entry<Integer, String> entry : data) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		
		sortUsingTraditionalCollection();
		System.out.println("*************************************************");
		sortUsingCollectionWithLambda();
		System.out.println("*************************************************");
	}
}
