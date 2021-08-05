package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	int price;

	Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class FilterDemo {

	public static void main(String ar[]) {

		// ArrayList declaration
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);

		// List declaration and initialization
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

		// Empty list to result
		List<Integer> even = new ArrayList<Integer>();

		// Using For loop
		for (Integer n : numbers) {
			if (n % 2 == 0) {
				even.add(n);
			}
		}
		System.out.println("Using For loop : " + even);

		// Using Stream - Predicate only
		even = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Using Stream : " + even);

		System.out.println("************************************************************");

		// Using Stream - Predicate and Consumer - ForEach representation 1
		numbers.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

		System.out.println("************************************************************");

		// Using Stream - Predicate and Consumer - ForEach representation 2
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		System.out.println("************************************************************");

		List<String> names = Arrays.asList("John", "Black", "Tommy", "Kelvin", "Jackie");
		List<String> longName = new ArrayList<String>();

		longName = names.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
		System.out.println(longName);

		System.out.println("************************************************************");

		List<Product> prodList = new ArrayList<Product>();
		prodList.add(new Product(1, "HP Laptop", 25000));
		prodList.add(new Product(1, "Dell Laptop", 50000));
		prodList.add(new Product(1, "Acer Laptop", 20000));

		prodList.stream().filter(p -> p.price > 20000).forEach(p -> System.out.println(p.price));

		System.out.println("************************************************************");

		al = null;
		numbers = null;
		even = null;
		names = null;
		longName = null;
		prodList = null;

	}
}
