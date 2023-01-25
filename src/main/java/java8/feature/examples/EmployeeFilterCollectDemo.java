package java8.feature.examples;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilterCollectDemo {

	public static List<Employee> taxEvaluationType1(String taxIndicator) {
		
		if (taxIndicator.equalsIgnoreCase("tax"))
			return EmployeeDataStore.getEmployees().stream().filter(e -> e.getSalary() > 500000)
					.collect(Collectors.toList());
		else
			return EmployeeDataStore.getEmployees().stream().filter(e -> e.getSalary() <= 500000)
					.collect(Collectors.toList());
	}

	public static List<Employee> taxEvaluationType2(String taxIndicator) {

		return (taxIndicator.equalsIgnoreCase("tax"))
				? EmployeeDataStore.getEmployees().stream().filter(e -> e.getSalary() > 500000)
						.collect(Collectors.toList())
				: EmployeeDataStore.getEmployees().stream().filter(e -> e.getSalary() <= 500000)
						.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		System.out.println(taxEvaluationType1("tax"));
		System.out.println(taxEvaluationType2("notax"));
	}
}
