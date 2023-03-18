package java10.feature.collections.enhancements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * In Java 10, we also have facility to create immutable copies of collections.
 * For this purpose, we have static methods introduced in the Interfaces.
 * 
 * List.CopyOf(), Set.CopyOf(), Map.CopyOf()
 * 
 * @author Jagatheshwaran N
 */
public class _02_ImmutableCollections_List_Demo2 {

	public static void main(String[] args) {

		var list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		var immutableList = List.copyOf(list);
		System.out.println(immutableList);
		// immutableList.add(4); // java.lang.UnsupportedOperationException
		list.add(4);
		var immutableList1 = Collections.unmodifiableList(list);
		System.out.println(immutableList1);
	}
}
