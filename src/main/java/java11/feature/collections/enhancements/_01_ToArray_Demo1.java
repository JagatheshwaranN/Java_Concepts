package java11.feature.collections.enhancements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01_ToArray_Demo1 {

	public static void main(String[] args) {

		// List Type 1
		var list1 = List.of("Java", "JavaScript");
		var list1Array = list1.toArray(String[]::new);
		for (var data : list1Array) {
			System.out.println(data);
		}

		// List Type 2
		var list2 = Arrays.asList("Kotlin", "JavaScript");
		var list2Array = list2.toArray(String[]::new);
		for (var data : list2Array) {
			System.out.println(data);
		}

		// List Type 3
		var list3 = new ArrayList<String>();
		list3.add("Spring");
		list3.add("JDBC");
		var list3Array = list3.toArray(String[]::new);
		for (var data : list3Array) {
			System.out.println(data);
		}

		var list4 = List.of(1, 2, 3, 4, 5);
		var list4Array = list4.toArray(Integer[]::new);
		for (var data : list4Array) {
			System.out.println(data);
		}
	}
}
