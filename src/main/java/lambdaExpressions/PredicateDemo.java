package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	int salary;
	int experience;
	String name;

	Employee(int salary, int experience, String name) {
		this.salary = salary;
		this.experience = experience;
		this.name = name;
	}
}

public class PredicateDemo {

	public static void main(String ar[]) {

		// Predicate is a predefined Functional Interface, It will be preferred when we
		// have conditional check.

		// Predicate of Type Integer takes input value and checks its greater or equal
		// to 10
		Predicate<Integer> p1 = i -> (i >= 10);
		System.out.println(p1.test(10));
		System.out.println(p1.test(5));

		System.out.println("************************************************************");

		// Predicate of Type String takes input value and checks its length greater or
		// equal
		// to 8
		Predicate<String> p2 = s -> (s.length() >= 8);
		System.out.println(p2.test("JourneyToIndia"));
		System.out.println(p2.test("Rose"));

		System.out.println("************************************************************");

		// Predicate is used to check the Array of values length greater or equal to 8
		String[] alist = { "Chennai", "Bangalore" };
		for (String a : alist) {
			if (p2.test(a)) {
				System.out.println(a);
			}
		}

		System.out.println("************************************************************");

		// Predicate is used to check the object value
		Predicate<Employee> p3 = emp -> (emp.salary > 10000);
		System.out.println(p3.test(new Employee(50000, 5, "John")));

		System.out.println("************************************************************");

		// Predicate is used to check the Array of object values
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(25000, 2, "Alex"));
		empList.add(new Employee(35000, 3, "Mary"));

		for (Employee emp : empList) {
			if (p3.test(emp)) {
				System.out.println(emp.name + " " + emp.salary + " " + emp.experience);
			}
		}

		System.out.println("************************************************************");

		// Joining Predicates - and / or / negate
		Predicate<Integer> p4 = n -> (n >= 10);
		Predicate<Integer> p5 = n -> (n % 2 == 0);

		int[] numberArray = { 10, 15, 20, 25, 30, 35, 40 };

		// p4 and p5 performed AND operation
		for (int i : numberArray) {
			if (p4.and(p5).test(i)) {
				System.out.println(i);
			}
		}

		System.out.println("************************************************************");

		// p4 and p5 performed OR operation
		for (int i : numberArray) {
			if (p4.or(p5).test(i)) {
				System.out.println(i);
			}
		}

		System.out.println("************************************************************");

		// p4 and p5 performed Negate operation
		for (int i : numberArray) {
			if (p5.negate().test(i)) {
				System.out.println(i);
			}
		}

		System.out.println("************************************************************");

		empList = null;
		alist = null;

	}
}
