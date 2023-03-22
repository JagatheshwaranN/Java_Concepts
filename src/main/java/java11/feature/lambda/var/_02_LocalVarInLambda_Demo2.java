package java11.feature.lambda.var;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class _02_LocalVarInLambda_Demo2 {

	public static void main(String[] args) {

		// Predicate
		Predicate<Integer> p = (var i) -> i % 2 == 0;
		System.out.println(p.test(10));

		// Function
		Function<Integer, Integer> f = (var n) -> {
			return (n * n);
		};
		System.out.println(f.apply(5));

		// Consumer
		Consumer<Student> c = (var s) -> {
			System.out.println(s.name);
		};
		c.accept(new Student("Graal"));
	}
}

class Student {

	String name;

	Student(String name) {
		this.name = name;
	}
}