package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int salary;

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class MapDemo {

	public static void main(String ar[]) {

		List<String> vehicle = Arrays.asList("car", "bus", "van", "ship", "flight");
		List<String> resultedVehicle = new ArrayList<String>();

		// Using For loop
		for (String object : vehicle) {
			resultedVehicle.add(object.toUpperCase());
		}
		System.out.println("Using For Loop : " + resultedVehicle);

		System.out.println("************************************************************");

		// Using Stream and Function - representation 1
		resultedVehicle = vehicle.stream().map(v -> v.toUpperCase()).collect(Collectors.toList());
		System.out.println("Using Stream : " + resultedVehicle);

		System.out.println("************************************************************");

		// Using Stream and Function - representation 2
		vehicle.stream().map(v -> v.toUpperCase()).forEach(v -> System.out.println(v));

		System.out.println("************************************************************");

		List<Employee> emp = Arrays.asList(new Employee(101, "John", 25000), new Employee(102, "Brown", 30000),
				new Employee(103, "Rose", 50000));

		// Combination of Filter and Map
		List<Integer> empSalList = emp.stream().filter(e -> e.salary > 25000).map(e -> e.salary)
				.collect(Collectors.toList());
		System.out.println(empSalList);

		System.out.println("************************************************************");

		// Combination of Filter and Map
		emp.stream().filter(e -> e.salary > 25000).map(e -> e.salary).forEach(e -> System.out.println(e));

		//sCombination of Filter and Map
		emp.stream().filter(e -> e.salary > 25000).map(e -> e.salary).forEach(System.out::println);

		System.out.println("************************************************************");
		
		empSalList = null;
		emp = null;
		vehicle = null;
		resultedVehicle = null;
	}
}
