package java8.feature.consumer;

import java.util.function.ObjIntConsumer;

/**
 * 
 * Consumer is used to accept the value passed to it and doesn't return any
 * value.
 * 
 * Represents an operation that accepts an object-valued and a int-valued
 * argument, and returns no result.
 * 
 * interface ObjIntConsumer <T> { public void accept (T t, int value); }
 * 
 * T-Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class _7_ObjIntConsumerDemo {

	public static void main(String[] args) {
		
		ObjIntConsumer<Double> oic = (d, i) -> System.out.println(d+i);
		oic.accept(150.00, 100);
	}
}
