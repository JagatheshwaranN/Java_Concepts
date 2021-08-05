package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String ar[]) {

		// ArrayList declaration
		ArrayList al1 = new ArrayList(); // Heterogeneous declaration
		// ArrayList<String> al2 = new ArrayList<String>(); // Homogeneous declaration

		// add() method
		al1.add(1);
		al1.add("Mani");
		al1.add(2);
		al1.add("Nandhini");
		System.out.println(al1); // [1, Mani, 2, Nandhini]

		// Adding Duplicate values
		al1.add("Nandhini");
		System.out.println(al1); // [1, Mani, 2, Nandhini, Nandhini]

		// Declaring the second ArrayList
		ArrayList al2 = new ArrayList();

		// addAll() method
		System.out.println(al2);
		al2.addAll(al1);
		al2.add(3);
		System.out.println(al2);

		// remove() method using Element
		al1.remove("Nandhini");
		al1.remove(2);
		System.out.println(al1); // [1, Mani, Nandhini]

		// removeAll() method - removing al2 elements from al1
		System.out.println(al1.removeAll(al2)); // true
		System.out.println(al1); // []

		// Adding elements into al1 after removing all elements
		al1.addAll(al2);
		System.out.println(al1); // [1, Mani, 2, Nandhini, Nandhini, 3]

		// removeAll() method - removing al1 elements from al2
		al2.add("jaga");
		al2.removeAll(al1);
		System.out.println(al2.removeAll(al1)); // false
		al2.addAll(al1);

		// Remaining values in second ArrayList
		System.out.println(al2); // [jaga]

		// size() method
		al1.size();
		System.out.println(al1.size()); // 6

		// contains() method - Positive
		al1.contains("Mani");
		System.out.println(al1.contains("Mani")); // true

		// contains() method - Negative
		al1.remove(2);
		al1.contains(2);
		System.out.println(al1.contains(2)); // false

		// Printing al1 and al2 elements before checking containsAll method
		System.out.println(al1);
		System.out.println(al2);

		// containsAll() method - Positive
		al2.containsAll(al1);
		System.out.println(al2.containsAll(al1)); // true

		// containsAll() method - Negative
		al1.containsAll(al2);
		System.out.println(al1.containsAll(al2)); // false

		// isEmpty() method - Negative
		al1.isEmpty();
		System.out.println(al1.isEmpty()); // false

		// clear() method
		al1.clear();
		System.out.println(al1); // []

		// isEmpty() method - Positive
		System.out.println(al1.isEmpty()); // true

		ArrayList al3 = new ArrayList();
		ArrayList al4 = new ArrayList();

		al3.add(1);
		al3.add(2);
		al3.add(3);
		al3.add(4);

		al4.add(1);
		al4.add(2);
		al4.add(5);
		al4.add(6);

		al3.retainAll(al4);
		System.out.println(al3.retainAll(al4)); // false
		System.out.println(al3); // [1, 2]

		al4.retainAll(al3);
		System.out.println(al4.retainAll(al3)); // false
		System.out.println(al4); // [1, 2]

		System.out.println("***** ArrayList specific methods *****");

		// get() method
		al2.get(2);
		System.out.println(al2.get(2)); // Mani

		// remove() method using Index
		al2.remove(5);
		System.out.println(al2); // [1, Mani, Nandhini]

		// add() method using Index
		al2.add(5, 3);
		System.out.println(al2); // [jaga, 1, Mani, 2, Nandhini, 3, 3]

		// set() method using Index
		al2.set(6, "sharmi");
		System.out.println(al2); // [jaga, 1, Mani, 2, Nandhini, 3, sharmi]

		System.out.println("***** Retrieving elements from ArrayList *****");

		System.out.println("***** Using For loop");
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		System.out.println("***** Using For Each loop");
		for (Object i : al2) {
			System.out.println(i);
		}
		System.out.println("***** Using Iterator");
		Iterator itr = al2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Conversion of Array into ArrayList
		String[] fruits = { "apple", "orange", "grapes" };
		ArrayList al5 = new ArrayList(Arrays.asList(fruits));
		System.out.println(al5);

	}

}
