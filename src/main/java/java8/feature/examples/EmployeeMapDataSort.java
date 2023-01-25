package java8.feature.examples;

import java.util.Comparator;
import java.util.Map;

public class EmployeeMapDataSort {

	public static void main(String[] args) {

		Map<Integer, Employee> empMapData = EmployeeDataStore.getEmployeesData();

		// Employee data sorting is done based on the key
		empMapData.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("*************************************************");

		// Employee data sortig is done based on the value. Here, value is of type
		// Object so we have used the Function to sort the data.
		empMapData.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println);
		System.out.println("*************************************************");

		// Employee data sortig is done based on the value. Here, value is of type
		// Object so we have used the Function to sort the data.
		empMapData.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getId).reversed()))
				.forEach(System.out::println);
	}
}
