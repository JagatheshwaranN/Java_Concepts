package java8.feature.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerOptionalDemo {

	public static Customer getCustomerEmail(String email) throws Exception {
		List<Customer> customers = Stream
				.of(new Customer(101, "Alex", "alex@email.com", Arrays.asList("9876543210", "9987554321")),
						new Customer(102, "Bower", "bower@gmail.com", Arrays.asList("8765432109", "9887554321")))
				.collect(Collectors.toList());
		//return customers.stream().filter(cust -> cust.getEmail().equals(email)).findAny().get();
		//return customers.stream().filter(cust -> cust.getEmail().equals(email)).findAny().orElse(new Customer());
		return customers.stream().filter(cust -> cust.getEmail().equals(email)).findAny().orElseThrow(()-> new Exception("Email id not found"));
	}

	public static void main(String[] args) throws Exception {

		List<Customer> customers = Stream
				.of(new Customer(101, "Alex", "alex@email.com", Arrays.asList("9876543210", "9987554321")),
						new Customer(102, "Bower", null, Arrays.asList("8765432109", "9887554321")))
				.collect(Collectors.toList());

		// of()
		Optional<String> customerEmail = Optional.of(customers.get(0).getEmail());
		System.out.println(customerEmail);

		// The below line will trhow NullPointer Exception when we have null value. of()
		// can be used when the object is non-null.
//		customerEmail = Optional.of(customers.get(1).getEmail());
//		System.out.println(customerEmail);

		// ofNullable()
		Optional<String> customerEmailId = Optional.ofNullable(customers.get(0).getEmail());
		System.out.println(customerEmailId);

		customerEmailId = Optional.ofNullable(customers.get(1).getEmail());
		System.out.println(customerEmailId);

		// get()
		Optional<String> customerMail = Optional.ofNullable(customers.get(0).getEmail());
		if (customerMail.isPresent()) {
			System.out.println(customerMail.get());
		}

		// orElse()
		customerMail = Optional.ofNullable(customers.get(1).getEmail());
		System.out.println(customerMail.orElse("default@email.com"));

		// orElseGet()
		customerMail = Optional.ofNullable(customers.get(1).getEmail());
		System.out.println(customerMail.orElseGet(() -> "default@email.com"));

		// orElseThrow()
//		customerMail = Optional.ofNullable(customers.get(1).getEmail());
//		System.out.println(customerMail.orElseThrow(() -> new IllegalArgumentException("Email Id is NULL")));

		getCustomerEmail("pqr");
	}
}
