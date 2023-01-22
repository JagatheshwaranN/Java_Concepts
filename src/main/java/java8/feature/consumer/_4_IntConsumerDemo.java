package java8.feature.consumer;

import java.util.function.IntConsumer;

/**
 * 
 * Consumer is used to accept the value passed to it and doesn't return any
 * value.
 * 
 * Represents an operation that accepts a single int-valued argument and returns
 * no result.
 * 
 * interface IntConsumer { public void accept (int value); }
 * 
 * @author Jagatheshwaran N
 *
 */
public class _4_IntConsumerDemo {

	public static void main(String[] args) {
		
		IntConsumer ic = i -> System.out.println(i*i);
		ic.accept(5);
	}
}
