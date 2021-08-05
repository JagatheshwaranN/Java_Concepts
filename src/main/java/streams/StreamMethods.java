package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {

		// distinct() - Used to retrieve only distinct values and case sensitive
		List<String> vehicles = Arrays.asList("Flight", "Car", "car", "bus", "bus", "ship");
		List<String> distinctVehicles = vehicles.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct elements : " + distinctVehicles);

		System.out.println("************************************************************");

		// count() - Used to count the elements in the stream
		long count = vehicles.stream().count();
		System.out.println("Stream elements count : " + count);

		System.out.println("************************************************************");

		// limit() - Used to limit the elements in stream
		List<String> limitVehicles = vehicles.stream().distinct().limit(2).collect(Collectors.toList());
		System.out.println("Limit value : " + limitVehicles);

		List<Integer> numbers = Arrays.asList(1, 3, 2, 4, 5, 7, 6, 8, 9, 10);

		System.out.println("************************************************************");

		// min() - Used to retrieve the minimum element from the stream
		Optional<Integer> mininum = numbers.stream().min((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println("Minimum value : " + mininum.get());

		System.out.println("************************************************************");

		// max() - Used to retrieve the maximum element from the stream
		Optional<Integer> maximum = numbers.stream().max((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println("Maximum value : " + maximum.get());

		List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

		System.out.println("************************************************************");

		// reduce() - Used to combine stream of objects into single collection
		Optional<String> reduceValues = stringList.stream().reduce((value, combinedValue) -> {
			return combinedValue + value;
		});
		System.out.println(reduceValues);

		System.out.println("************************************************************");

		// toArray() - Used to convert the stream elements into Array
		Object[] ar = stringList.stream().toArray();
		for (Object a : ar) {
			System.out.println(a);
		}

		System.out.println("************************************************************");

		// sorted() - Used to sort the stream elements
		List<Integer> sortedList1 = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List(Ascending) : " + sortedList1);

		List<Integer> sortedList2 = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted List(Descending) : " + sortedList2);

		System.out.println("************************************************************");

		Set<String> fruits = new HashSet<String>();
		fruits.add("One apple");
		fruits.add("one apple");
		fruits.add("one mango");
		fruits.add("one orange");

		// anyMatch() - Used to check any matching values are present in stream
		boolean result1 = fruits.stream().anyMatch(value -> {
			return value.startsWith("one");
		});
		System.out.println("Any Match : " + result1);

		// allMatch() - Used to check all matching values are present in stream
		boolean result2 = fruits.stream().allMatch(v -> {
			return v.startsWith("one");
		});
		System.out.println("All Match : " + result2);

		// noneMatch() - Used to check none matching values are present in stream
		boolean result3 = fruits.stream().noneMatch(v -> {
			return v.startsWith("one");
		});
		System.out.println("None Match : " + result3);

		System.out.println("************************************************************");

		List<String> num = Arrays.asList("one", "two", "three", "four");

		// findAny() - Used to retrieve any element from the stream
		Optional<String> value1 = fruits.stream().findAny();
		System.out.println("Find Any value : " + value1.get());

		// findFirst() - Used to retrieve the first element from the stream
		Optional<String> value2 = num.stream().findFirst();
		System.out.println("Find First value : " + value2.get());

		System.out.println("************************************************************");

		List<String> animal = Arrays.asList("Dog", "Cat");
		List<String> birds = Arrays.asList("peacock", "parrot");

		Stream<String> s1 = animal.stream();
		Stream<String> s2 = birds.stream();

		// concat() - Used to cancat two stream elements
		List<String> finalList = Stream.concat(s1, s2).collect(Collectors.toList());
		System.out.println("Concat Stream values : " + finalList);

		finalList = null;
		animal = null;
		birds = null;
		value2 = null;
		value1 = null;
		fruits = null;
		sortedList1 = null;
		sortedList2 = null;
		ar = null;
		reduceValues = null;
		mininum = null;
		maximum = null;
		limitVehicles = null;
		distinctVehicles = null;
		vehicles = null;
	}

}
