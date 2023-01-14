package java8.feature.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * 
 * Consumer is used to accept the value passed to it and doesn't return any
 * value.
 * 
 * Represents an operation that accepts a single input argument and returns no
 * result.
 * 
 * interface Consumer <T> { public void accept (T t); }
 * 
 * T-Type
 * 
 * @author Jagatheshwaran N
 *
 */

class Students {

	String name;
	int mark;

	Students(String name, int mark) {
		this.name = name;
		this.mark = mark;
	}
}

public class ConsumerDemo1 {

	public static void main(String[] args) {

		ArrayList<Students> al = new ArrayList<Students>();
		al.add(new Students("Alex", 85));
		al.add(new Students("Blue", 75));
		al.add(new Students("John", 65));
		al.add(new Students("Eric", 55));

		Consumer<Students> c = s -> {
			System.out.println(s.name + " " + s.mark);
		};

		for (Students s1 : al) {
			c.accept(s1);
		}
	}

}
