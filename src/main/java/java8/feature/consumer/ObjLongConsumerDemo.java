package java8.feature.consumer;

import java.util.Date;
import java.util.function.ObjLongConsumer;

/**
 * 
 * Consumer is used to accept the value passed to it and doesn't return any
 * value.
 * 
 * Represents an operation that accepts an object-valued and a long-valued
 * argument, and returns no result.
 * 
 * interface ObjLongConsumer <T> { public void accept (T t, long value); }
 * 
 * T-Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class ObjLongConsumerDemo {

	public static void main(String[] args) {

		ObjLongConsumer<Integer> olc = (i, l) -> System.out.println(i + l);
		olc.accept(32767, new Date().getTime());
	}
}
