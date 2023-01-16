package java8.feature.consumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;

/**
 * 
 * BiConsumer is used to accept the two arguments passed to it.
 * 
 * Represents an operation that accepts two input arguments and returns no
 * result.
 * 
 * interface Consumer <T, U> { public void accept (T t, U u); }
 * 
 * T & U - Type
 * 
 * @author Jagatheshwaran N
 *
 */

class Staff {
	
	String name;
	double salary;

	Staff(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class BiConsumerDemo {

	public static void main(String[] args) {

		ArrayList<Staff> al = new ArrayList<Staff>();
		populate(al);
		BiConsumer<Staff, Double> c = (s, d) -> s.salary = s.salary + d;
		for (Staff s : al) {
			c.accept(s, 500.0);
			System.out.println(s.name + " " + s.salary);
		}
	}

	public static void populate(ArrayList<Staff> al) {

		al.add(new Staff("Alex", 5000));
		al.add(new Staff("Blake", 3000));
	}
}
