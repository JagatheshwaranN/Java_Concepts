package java15.feature.sealed.classes;

public class _01_SealedClass_Demo1 {

	public static void main(String[] args) {

		Person manager1 = new Manager(101, "John");
		System.out.println(getId(manager1));
		System.out.println(manager1.getName());

		Manager manager2 = new Manager(101, "John");
		System.out.println(manager2.getManagerId());
		System.out.println(manager2.getName());

		Person employee1 = new Employee(201, "Alex");
		System.out.println(getId(employee1));
		System.out.println(employee1.getName());

		Employee employee2 = new Employee(201, "Alex");
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee2.getEmployeeName());
	}

	private static int getId(Person person) {
		
		if (person instanceof Employee emp) {
			return emp.getEmployeeId();
		} else if (person instanceof Manager mgr) {
			return mgr.getManagerId();
		}
		return -1;
	}
}

abstract sealed class Person permits Employee, Manager {

	String name;

	String getName() {
		return name;
	}
}

final class Employee extends Person {

	String name;
	int id;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getEmployeeId() {
		return id;
	}

	public String getEmployeeName() {
		return name;
	}
}

non-sealed class Manager extends Person {

	int id;

	Manager(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getManagerId() {
		return id;
	}
}
