package streams;

import java.util.Arrays;
import java.util.List;

class Employees {
	int id;
	String name;
	int salary;

	Employees(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class ParallelStreamDemo {

	public static void main(String[] args) {

		List<Employees> employeeList = Arrays.asList(new Employees(101, "John", 25000),
				new Employees(102, "Alex", 30000));

		// Using stream
		employeeList.stream().filter(e -> e.salary > 25000).forEach(s -> System.out.println(s.name + " " + s.salary));

		System.out.println("************************************************************");

		// Parallel stream using parallelStream()
		employeeList.parallelStream().filter(e -> e.salary > 25000)
				.forEach(s -> System.out.println(s.name + " " + s.salary));

		System.out.println("************************************************************");

		// Parallel stream using parallel()
		employeeList.stream().parallel().filter(e -> e.salary > 25000)
				.forEach(s -> System.out.println(s.name + " " + s.salary));
		
		employeeList = null;
	}

}
