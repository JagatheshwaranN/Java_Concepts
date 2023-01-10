package java8.features;

import java.util.ArrayList;
import java.util.Collections;

class Employee {

	int eno;
	String ename;

	Employee(int eno, String ename) {

		this.eno = eno;
		this.ename = ename;
	}

	public String toString() {

		return eno + "~" + ename;
	}
}

public class LambdaExpWithCustomClassDemo6 {

	public static void main(String[] args) {

		ArrayList<Employee> object = new ArrayList<Employee>();
		object.add(new Employee(121, "Alex"));
		object.add(new Employee(123, "John"));
		object.add(new Employee(122, "Blake"));
		System.out.println("Array List in insertion order " + object);
		Collections.sort(object, (e1, e2) -> e1.ename.compareTo(e2.ename));
		System.out.println("Array List in ascending order " + object);
	}

}
