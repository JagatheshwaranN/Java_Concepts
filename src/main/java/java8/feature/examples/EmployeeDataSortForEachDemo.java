package java8.feature.examples;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDataSortForEachDemo {

	public static List<Employee> employeeTemp;

	public static List<Employee> fetchEmployees() {

		return EmployeeDataStore.getEmployees();
	}

	public static void traditionalSortAsc() {

		employeeTemp = fetchEmployees();
		Collections.sort(employeeTemp, new MyComparatorAsc());
		System.out.println(employeeTemp);
	}

	public static void traditionalSortDesc() {

		employeeTemp = fetchEmployees();
		Collections.sort(employeeTemp, new MyComparatorDesc());
		System.out.println(employeeTemp);
	}

	public static void traditionalSortUsingLambda() {

		employeeTemp = fetchEmployees();
		Collections.sort(employeeTemp, (o1, o2) -> o1.getSalary() - o2.getSalary());
		System.out.println(employeeTemp);
	}

	public static void ascSortUsingStreamSort() {

		employeeTemp = fetchEmployees();
		employeeTemp.stream().sorted((o1, o2) -> o1.getSalary() - o2.getSalary());
		System.out.println(employeeTemp);
	}

	public static void ascSortUsingStreamSortForEachType1() {

		employeeTemp = fetchEmployees();
		employeeTemp.stream().sorted((o1, o2) -> o1.getSalary() - o2.getSalary()).forEach(System.out::println);
	}

	public static void ascSortUsingStreamSortForEachType2() {

		employeeTemp = fetchEmployees();
		employeeTemp.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
	}

	public static void ascSortUsingStreamSortForEachType3() {

		employeeTemp = fetchEmployees();
		employeeTemp.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	}

	public static void main(String[] args) {

		traditionalSortAsc();
		System.out.println("*************************************************");
		traditionalSortDesc();
		System.out.println("*************************************************");
		traditionalSortUsingLambda();
		System.out.println("*************************************************");
		ascSortUsingStreamSort();
		System.out.println("*************************************************");
		ascSortUsingStreamSortForEachType1();
		System.out.println("*************************************************");
		ascSortUsingStreamSortForEachType2();
		System.out.println("*************************************************");
		ascSortUsingStreamSortForEachType3();
	}
}

class MyComparatorAsc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getSalary() - o2.getSalary();
	}

}

class MyComparatorDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o2.getSalary() - o1.getSalary();
	}
}
