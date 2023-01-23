package java8.feature.reference;

interface Student {

	public StudentDemo get(String name, int mark);
}

class StudentDemo {

	String name;
	int mark;

	public StudentDemo(String name, int mark) {

		this.name = name;
		this.mark = mark;
	}

	public String toString() {
		return this.name + " " + this.mark;
	}
}

public class _6_ConstructorReferenceDemo3 {

	public static void main(String[] args) {

		// Student s = (name, mark) -> new StudentDemo(name, mark);
		Student s = StudentDemo::new;
		System.out.println(s.get("Alex", 98).toString());
	}
}
