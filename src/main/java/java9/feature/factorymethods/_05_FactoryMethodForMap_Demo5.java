package java9.feature.factorymethods;

import java.util.Map;

/**
 * In Java 9, Map includes Map.of() and Map.ofEntries() static factory methods
 * that provide a convenient way to create immutable maps.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _05_FactoryMethodForMap_Demo5 {

	public static void main(String[] args) {

		Map<Integer, String> topics = Map.of(101, "Core Java", 102, "Advanced Java", 103, "Java struts");
		topics.entrySet().stream().forEach(System.out::println);
	}
}
