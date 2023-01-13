package java8.feature.function;

import java.util.ArrayList;
import java.util.function.Function;

class Student {

	String name;
	int mark;

	Student(String name, int mark) {
		this.name = name;
		this.mark = mark;
	}

	public String toString() {
		return "Studen Name : " + name + " | " + "Mark : " + mark;
	}
}

public class FunctionDemo3 {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("Alex", 85));
		al.add(new Student("John", 75));
		al.add(new Student("Blue", 65));
		al.add(new Student("Eric", 55));

		Function<Student, String> f = s -> {
			String grade = "";
			int mark = s.mark;
			if (mark > 80)
				grade = "A";
			else if (mark > 70)
				grade = "B";
			else if (mark > 60)
				grade = "C";
			else
				grade = "D";
			return grade;
		};

		for (Student s : al) {

			System.out.println(s.toString() + " | " + "Grade : " + f.apply(s));
		}
	}

}
