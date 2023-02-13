package java9.feature.factorymethods;

import java.util.Set;

public class _04_FactoryMethodForSet_Demo2 {

	public static void main(String[] args) {

		// static <E> Set<E> of(E... elements) - When we have more than 10 elements
		// then it will use VarArg method
		Set<String> topics = Set.of("Jshell", "Try With Resource", "Private Methods", "Factory Methods",
				"Stream API enhancements", "Java Platform Module System", "Diamond Operator", "Safe VarArg annotations",
				"Process API enhancements", "HTTP/2 client", "G1 Garbage Collector", "JLink");
		topics.stream().sorted().forEach(System.out::println);
	}
}
