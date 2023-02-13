package java9.feature.stream.enhancements;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * This method will check whether the provided element is null or not. If its
 * not null, then this method returns the Stream of that element. If its null
 * then this method returns empty stream.
 * 
 * public static Stream<T>ofNullable(T t)
 * 
 * @author Jagatheshwaran N
 *
 */
public class _04_StreamAPIEnhancement_OfNullable_Demo1 {

	public static void main(String[] args) {

		long count = Stream.ofNullable(100).count();
		System.out.println(count);
		count = Stream.ofNullable(null).count();
		System.out.println(count);
		List<Integer> number1 = Stream.ofNullable(100).collect(Collectors.toList());
		System.out.println(number1);
		List<Object> number2 = Stream.ofNullable(null).collect(Collectors.toList());
		System.out.println(number2);
	}
}
