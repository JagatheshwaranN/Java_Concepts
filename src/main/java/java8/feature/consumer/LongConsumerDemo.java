package java8.feature.consumer;

import java.util.Date;
import java.util.function.LongConsumer;

/**
 * 
 * Consumer is used to accept the value passed to it and doesn't return any
 * value.
 * 
 * Represents an operation that accepts a single long-valued argument and
 * returns no result.
 * 
 * interface LongConsumer { public void accept (long value); }
 * 
 * @author Jagatheshwaran N
 *
 */
public class LongConsumerDemo {

	public static void main(String[] args) {
		
		LongConsumer lc = l -> System.out.println(l);
		lc.accept(new Date().getTime());

	}

}
