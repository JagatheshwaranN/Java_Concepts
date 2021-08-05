package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	int id;
	String name;
	char grade;

	Student(int id, String name, char grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
}

public class FlatMapDemo {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2);
		List<Integer> list2 = Arrays.asList(3, 4);
		List<Integer> list3 = Arrays.asList(5, 6);

		List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);

		// Using FlatMap
		List<Integer> result1 = finalList.stream().flatMap(n -> n.stream()).collect(Collectors.toList());
		System.out.println(result1);

		System.out.println("************************************************************");

		// Combination of Map and FlatMap
		List<Integer> result2 = finalList.stream().flatMap(n -> n.stream()).map(n -> n + 10)
				.collect(Collectors.toList());
		System.out.println(result2);

		System.out.println("************************************************************");

		List<String> team1 = Arrays.asList("John", "Bruce");
		List<String> team2 = Arrays.asList("Kevin", "Tony");

		List<List<String>> finalTeam = Arrays.asList(team1, team2);

		// Using For Each Loop
		System.out.println("Using For Each loop");
		for (List<String> teams : finalTeam) {
			for (String t : teams) {
				System.out.println(t);
			}
		}

		System.out.println("************************************************************");

		// Using Stream
		List<String> names = finalTeam.stream().flatMap(t -> t.stream()).collect(Collectors.toList());
		System.out.println("Using Stream : " + names);

		System.out.println("************************************************************");

		List<Student> s1 = new ArrayList<Student>();
		s1.add(new Student(101, "John", 'A'));
		List<Student> s2 = new ArrayList<Student>();
		s2.add(new Student(102, "Alex", 'B'));
		List<Student> s3 = new ArrayList<Student>();
		s3.add(new Student(103, "Rose", 'C'));

		List<List<Student>> finalStLists = Arrays.asList(s1, s2, s3);

		// Using For Each Loop
		for (List<Student> students : finalStLists) {
			for (Student student : students) {
				System.out.println(student.name + " " + student.grade);
			}
		}

		System.out.println("************************************************************");

		// Using Stream - Combination of Map and FlatMap
		List<String> StudentsList = finalStLists.stream().flatMap(students -> students.stream())
				.map(s -> s.name + " " + s.grade).collect(Collectors.toList());
		System.out.println(StudentsList);

		System.out.println("************************************************************");

		StudentsList = null;
		finalStLists = null;
		finalTeam = null;
		result2 = null;
		result1 = null;
		finalList = null;

	}

}
