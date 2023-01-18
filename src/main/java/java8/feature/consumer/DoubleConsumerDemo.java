package java8.feature.consumer;

import java.util.function.DoubleConsumer;

/**
 * 
 * Consumer is used to accept the value passed to it and doesn't return any
 * value.
 * 
 * Represents an operation that accepts a single double-valued argument and returns
 * no result.
 * 
 * interface DoubleConsumer { public void accept (double value); }
 * 
 * @author Jagatheshwaran N
 *
 */
public class DoubleConsumerDemo {
	
	public static void main (String[] args) {
		
		DoubleConsumer dc = d -> System.out.println(d);
		dc.accept(Math.PI);
	}
}
