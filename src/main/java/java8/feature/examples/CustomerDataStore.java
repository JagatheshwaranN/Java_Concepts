package java8.feature.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDataStore {

	public static List<Customer> getCustomers() {
		return Stream
				.of(new Customer(101, "Alex", "alex@email.com", Arrays.asList("9876543210", "9987554321")),
						new Customer(102, "Bower", "bower@email.com", Arrays.asList("8765432109", "9887554321")),
						new Customer(103, "John", "john@email.com", Arrays.asList("7986543210", "8897554321")),
						new Customer(104, "Erica", "erica@email.com", Arrays.asList("7654321098", "7554321998")),
						new Customer(105, "Jenni", "jenni@email.com", Arrays.asList("7976543210", "8755432109")))
				.collect(Collectors.toList());
	}
}
