package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee2 {

	int salary;
	String name;

	Employee2(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}
}

public class ConsumerDemo {

	public static void main(String[] args) {

		// Consumer is a predefined Functional Interface.It takes data of any type and
		// doesn't return any value.

		Consumer<String> c1 = s -> System.out.println(s);
		c1.accept("Welcome");

		System.out.println("************************************************************");

		ArrayList<Employee2> emplist = new ArrayList<Employee2>();
		emplist.add(new Employee2(50000, "John"));
		emplist.add(new Employee2(60000, "Alex"));

		// Combination of Predicate, Function and Consumer
		Function<Employee2, Integer> f1 = emp -> {
			int sal = emp.salary;
			if (sal > 45000)
				return (sal * 10 / 100);
			else
				return (sal * 5 / 100);
		};

		Predicate<Integer> p1 = b -> b > 5000;

		Consumer<Employee2> c2 = eData -> {
			System.out.println(eData.name + " " + eData.salary);
		};

		for (Employee2 e : emplist) {
			int bonus = f1.apply(e);
			if (p1.test(bonus)) {
				c2.accept(e);
			}
		}

		System.out.println("************************************************************");

		emplist = null;
	}
}
