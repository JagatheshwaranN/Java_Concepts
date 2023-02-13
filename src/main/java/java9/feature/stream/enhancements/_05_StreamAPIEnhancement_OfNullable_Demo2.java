package java9.feature.stream.enhancements;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _05_StreamAPIEnhancement_OfNullable_Demo2 {

	public static void main(String[] args) {

		List<String> elements = new ArrayList<String>();
		elements.add("A");
		elements.add("B");
		elements.add(null);
		elements.add("C");
		// With filter()
		List<String> list1 = elements.stream().filter(e -> e != null).collect(Collectors.toList());
		System.out.println(list1);
		// With ofNullable()
		List<String> list2 = elements.stream().flatMap(e -> Stream.ofNullable(e)).collect(Collectors.toList());
		System.out.println(list2);
	}
}
