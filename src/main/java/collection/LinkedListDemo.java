package collection;

import java.util.LinkedList;

public class LinkedListDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// LinkedList Declaration
		LinkedList ll1 = new LinkedList();
		// LinkedList<String> ll2 = new LinkedList<String>();

		// add() method
		ll1.add("emp1");
		ll1.add("emp2");
		ll1.add("emp3");
		System.out.println(ll1);

		// add() method using Index
		ll1.add(3, "emp4");
		System.out.println(ll1);

		// addAll() method
		LinkedList ll2 = new LinkedList();
		ll2.addAll(ll1);
		System.out.println(ll2);

	}

}
