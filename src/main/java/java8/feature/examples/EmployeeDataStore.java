package java8.feature.examples;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataStore {

	public static List<Employee> getEmployees() {

		List<Employee> empObject = new ArrayList<Employee>();
		empObject.add(new Employee(101, "Alex", "Production", 400000));
		empObject.add(new Employee(120, "Brown", "Sales", 600000));
		empObject.add(new Employee(112, "John", "Infrastructure", 500000));
		empObject.add(new Employee(175, "Jenni", "Hospitality", 550000));
		empObject.add(new Employee(150, "Erica", "Admin", 700000));
		return empObject;
	}
}
