package java8.feature.function;

import java.util.function.Function;

public class FunctionDemo2 {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();
		int length = f.apply("Alex");
		System.out.println(length);
	}

}
