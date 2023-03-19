package java10.feature.optional.enhancement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.feature.examples.Customer;

/**
 * The method OrElseThrow() is now a preferred alternative for get() method.
 * 
 * @author Jagatheshwaran N
 */
public class _02_Optional_OrElseThrow_Demo2 {

	public static void main(String[] args) {

		List<Customer> customers = Stream
				.of(new Customer(101, "Alex", "alex@email.com", Arrays.asList("9876543210", "9987554321")),
						new Customer(102, "Bower", null, Arrays.asList("8765432109", "9887554321")))
				.collect(Collectors.toList());

		Optional<String> customerMail = Optional.ofNullable(customers.get(0).getEmail());
		if (customerMail.isPresent()) {
			System.out.println(customerMail.orElseThrow());
		}
	}
}
