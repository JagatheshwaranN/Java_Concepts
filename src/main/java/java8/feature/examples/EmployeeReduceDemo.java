package java8.feature.examples;

public class EmployeeReduceDemo {

	public static void main(String[] args) {

		// Get the sum of salary of the employees whose grade is A
		double sumOfSalaryOfEmployees = EmployeeDataStore.getEmployeesDetail().stream()
				.filter(emp -> emp.getGrade().equalsIgnoreCase("A")).map(emp -> emp.getSalary()).mapToDouble(emp -> emp)
				.sum();
		System.out.println("The sum of salary of grade A employees is " + sumOfSalaryOfEmployees);

		// Get the average salary of the employees whose grade is A
		double averageSalaryOfEmployees = EmployeeDataStore.getEmployeesDetail().stream()
				.filter(emp -> emp.getGrade().equalsIgnoreCase("A")).map(emp -> emp.getSalary()).mapToDouble(emp -> emp)
				.average().getAsDouble();
		System.out.println("The average salary of grade A employees is " + averageSalaryOfEmployees);
	}
}
