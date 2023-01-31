package java8.feature.examples;

import java.util.List;

public class EmployeeParallelStreamDemo {

	static List<Employee> employees = EmployeeDataStore.createAndGetEmployees();
	static long startTime;
	static long endTime;

	public static void calculateAvgSalaryUsingStream() {

		startTime = System.currentTimeMillis();
		double salarywithStream = employees.stream().map(Employee::getSalary).mapToInt(i -> i).average().getAsDouble();
		endTime = System.currentTimeMillis();
		System.out.println("Time taken to calculate the average salary " + salarywithStream
				+ " of 1000 employees using stream is " + (endTime - startTime));
	}

	public static void calculateAvgSalaryUsingParallelStream() {

		startTime = System.currentTimeMillis();
		double salarywithParallelStream = employees.parallelStream().map(Employee::getSalary).mapToInt(i -> i).average()
				.getAsDouble();
		endTime = System.currentTimeMillis();
		System.out.println("Time taken to calculate the average salary " + salarywithParallelStream
				+ " of 1000 employees using parallel stream is " + (endTime - startTime));
	}

	public static void main(String[] args) {

		calculateAvgSalaryUsingStream();
		calculateAvgSalaryUsingParallelStream();
	}
}
