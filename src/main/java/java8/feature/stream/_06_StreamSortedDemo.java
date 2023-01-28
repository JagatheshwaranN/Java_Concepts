package java8.feature.stream;

import java.util.ArrayList;

/***
 * The Streams is used to process the elements from the Collection. It is best
 * helpful to do bulk operations on collection. The stream () method present
 * inside the Collection Interface.
 * 
 * sorted() - It is used to sort the stream objects.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _06_StreamSortedDemo {

	public static void defaultSort() {

		ArrayList<Integer> al = storedElements();
		al.stream().sorted().forEach(System.out::println);
	}

	public static void customAscSort() {

		ArrayList<Integer> al = storedElements();
		al.stream().sorted((i1, i2) -> (i1 > i2) ? +1 : (i1 < i2) ? -1 : 0).forEach(System.out::println);
	}

	public static void customDescSort() {

		ArrayList<Integer> al = storedElements();
		al.stream().sorted((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0).forEach(System.out::println);
	}

	public static void main(String[] args) {

		defaultSort();
		System.out.println("***********************");
		customAscSort();
		System.out.println("***********************");
		customDescSort();
	}

	public static ArrayList<Integer> storedElements() {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(90);
		al.add(70);
		al.add(85);
		al.add(65);
		al.add(45);
		al.add(48);
		return al;
	}
}
