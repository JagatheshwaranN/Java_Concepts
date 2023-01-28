package java8.feature.stream;

import java.util.stream.Stream;

public class _09_Stream_StreamOfDemo {

	public static void main(String[] args) {

		Integer[] i = { 10, 30, 25, 82, 95, 87 };
		Stream.of(i).sorted((i1, i2) -> i1.compareTo(i2)).forEach(System.out::println);
		System.out.println("********************");
		Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
		s.forEach(System.out::println);
	}
}
