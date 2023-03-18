package java10.feature.collections.enhancements;

import java.util.ArrayList;
import java.util.Collections;

/**
 * In Java 10, we have enhancements to the Collections. We have option to make
 * the collections as unmodifiable collections.
 * 
 * unmodifiableList (), unmodifiableSet (), unmodifiableMap (),
 * unmodifiableCollection ()
 * 
 * @author Jagatheshwaran N
 */
public class _01_ImmutableCollections_List_Demo1 {

	public static void main(String[] args) {

		var list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		var immutableList = Collections.unmodifiableList(list);
		System.out.println(immutableList);
		immutableList.add(4);
	}
}
