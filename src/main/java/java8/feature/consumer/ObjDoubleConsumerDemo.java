package java8.feature.consumer;

import java.util.Date;
import java.util.function.ObjDoubleConsumer;

/**
 * 
 * Consumer is used to accept the value passed to it and doesn't return any
 * value.
 * 
 * Represents an operation that accepts an object-valued and a double-valued
 * argument, and returns no result.
 * 
 * interface ObjDoubleConsumer <T> { public void accept (T t, double value); }
 * 
 * T-Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class ObjDoubleConsumerDemo {

	public static void main (String[] args) {
		
		ObjDoubleConsumer<Long> odc = (l, d) -> System.out.println(l+d);
		odc.accept(new Date().getTime(), 10.0);
	}
}
