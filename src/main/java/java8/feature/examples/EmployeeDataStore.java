package java8.feature.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

	public static Map<Integer, Employee> getEmployeesData() {

		Map<Integer, Employee> empObject = new TreeMap<Integer, Employee>();
		empObject.put(1001, new Employee(101, "Alex", "Production", 400000));
		empObject.put(1020, new Employee(120, "Brown", "Sales", 600000));
		empObject.put(1012, new Employee(112, "John", "Infrastructure", 500000));
		empObject.put(1075, new Employee(175, "Jenni", "Hospitality", 550000));
		empObject.put(1050, new Employee(150, "Erica", "Admin", 700000));
		return empObject;
	}
}
