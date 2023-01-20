package java8.feature.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	int eno;
	String ename;
	double salary;
	int dno;

	Employee(int eno, String ename, double salary, int dno) {

		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.dno = dno;
	}

	public String toString() {
		return eno + " " + ename + " " + salary + " " + dno;
	}
}

public class _3_PredicateChainingDemo1 {

	public static ArrayList<Employee> storeEmployeeObjects() {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(121, "Alex", 3500, 20));
		al.add(new Employee(122, "John", 3000, 10));
		al.add(new Employee(123, "Blake", 5000, 20));
		al.add(new Employee(124, "Eric", 2500, 30));
		return al;
	}

	public static void predicateAndCondt() {

		ArrayList<Employee> al = storeEmployeeObjects();

		Predicate<Employee> p1 = e -> e.salary > 2000;
		Predicate<Employee> p2 = e -> e.dno == 20;

		for (Employee emp : al) {

			if (p1.and(p2).test(emp)) {
				System.out.println(emp);
			}
		}
	}

	public static void predicateOrCondt() {

		ArrayList<Employee> al = storeEmployeeObjects();

		Predicate<Employee> p1 = e -> e.salary > 2000;
		Predicate<Employee> p2 = e -> e.dno == 20;

		for (Employee emp : al) {

			if (p1.or(p2).test(emp)) {
				System.out.println(emp);
			}
		}
	}

	public static void main(String[] args) {

		predicateAndCondt();
		System.out.println("**************************************");
		predicateOrCondt();
	}

}
