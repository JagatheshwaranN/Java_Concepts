package java8.feature.examples;

public class Employees {

	private int id;
	private String name;
	private String grade;
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String dept) {
		this.grade = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employees(int id, String name, String grade, int salary) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", grade=" + grade + ", salary=" + salary + "]";
	}
}
