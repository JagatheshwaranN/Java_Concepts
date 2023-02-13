package java9.feature.factorymethods;

import java.util.Set;

/**
 * 
 * Java Set interface provides a Set.of() static factory method which is used to
 * create immutable set.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _03_FactoryMethodForSet_Demo1 {

	public static void main(String[] args) {

		Set<String> topics = Set.of("Inheritance", "Polymorphism", "Abstraction", "Data hiding");
		topics.stream().forEach(System.out::println);
	}
}
