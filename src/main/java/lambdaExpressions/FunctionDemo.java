package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1 {

	int salary;
	String name;

	Employee1(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}
}

public class FunctionDemo {

	public static void main(String ar[]) {

		// Function is a predefined Functional Interface, It will be preferred when we
		// have to perform operation and get the return value

		// Function takes integer value as input and perform operation on the input,
		// then return the output as integer
		Function<Integer, Integer> f1 = n -> n * n;
		System.out.println(f1.apply(5));

		System.out.println("************************************************************");

		// Function takes string value as input and perform operation on the input,
		// then return the output as integer
		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("Welcome"));

		System.out.println("************************************************************");

		// Function is takes the Array of object values, performs operation and return
		// the output
		ArrayList<Employee1> emplist = new ArrayList<Employee1>();
		emplist.add(new Employee1(50000, "John"));
		emplist.add(new Employee1(60000, "Alex"));

		Function<Employee1, Integer> f3 = emp -> {
			int sal = emp.salary;
			if (sal > 45000)
				return (sal * 10 / 100);
			else
				return (sal * 5 / 100);
		};

		for (Employee1 e1 : emplist) {
			int bonus = f3.apply(e1);
			System.out.println(bonus);
		}

		System.out.println("************************************************************");

		// Combination of Predicate and Function
		Predicate<Integer> p1 = b -> b > 5000;
		for (Employee1 e2 : emplist) {
			int bonus = f3.apply(e2);
			if (p1.test(bonus)) {
				System.out.println("Bonus calculated using Predicate : " + bonus);
			}
		}

		System.out.println("************************************************************");

		// Function chaining
		Function<Integer, Integer> f4 = n -> n * 2;
		Function<Integer, Integer> f5 = n -> n * n * n;

		// f4 processed first and then f5
		System.out.println(f4.andThen(f5).apply(2));
		// f5 processed first and then f4
		System.out.println(f4.compose(f5).apply(2));

		System.out.println("************************************************************");
		
		emplist = null;

	}

}
