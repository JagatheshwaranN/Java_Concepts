package java8.feature.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpArrayListCompDemo5 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(20);
		al.add(15);
		al.add(25);
		System.out.println("ArrayList insertion order " + al);
		
		Comparator<Integer> reference = (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;
		Collections.sort(al, reference);
		System.out.println("ArrayList ascending order " + al);
		
		// Perform manipulation on arraylist object and print even numbers from
		// arraylist
		List<Integer> al2 = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("ArrayList even numbers in ascending order " + al2);
	
		// Print arraylist values using streams
		al.stream().forEach(System.out::println);
	}

}
