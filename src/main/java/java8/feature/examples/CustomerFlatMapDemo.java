package java8.feature.examples;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerFlatMapDemo {

	public static void main(String[] args) {

		List<Customer> customerData = CustomerDataStore.getCustomers();

		// List<Customer> -> List<String>
		// customer -> customer.getEmail() >> one-to-one mapping
		List<String> customerEmails = customerData.stream().map(customer -> customer.getEmail())
				.collect(Collectors.toList());
		System.out.println(customerEmails);

		// When try to retrieve the phone numbers using map () method. We will get the
		// Stream of Stream data.
		// customer -> customer.getPhoneNumbers() >> one-to-many mapping
		List<List<String>> customerPhoneNos = customerData.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(customerPhoneNos);

		// customer -> customer.getPhoneNumbers() >> one-to-many mapping. FlatMap is
		// suitable.
		List<String> customerPhoneNumbers = customerData.stream()
				.flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(customerPhoneNumbers);
	}
}
