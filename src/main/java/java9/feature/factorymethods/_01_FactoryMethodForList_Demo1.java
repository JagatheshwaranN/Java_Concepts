package java9.feature.factorymethods;

import java.util.List;

/**
 * 
 * Java 9 Collection library includes static factory methods for List, Set and
 * Map interface. These methods are useful to create small number of
 * collections.
 * 
 * With the help of List.of() factory method, we can create unmodifiable
 * collection.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _01_FactoryMethodForList_Demo1 {

	public static void main(String[] args) {

		List<String> topics = List.of("Core Java", "Advanced Java", "Java Springboot", "Java struts", "Java MVC");
		topics.stream().forEach(System.out::println);
	}
}
