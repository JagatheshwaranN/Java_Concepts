package java8.feature.function;

import java.util.Date;
import java.util.function.ToLongFunction;

/**
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that produces an long-valued result.
 * 
 * interface ToLongFunction { public long applyAsLong (T value); }
 * 
 * T-Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class ToLongFunctionDemo {
	
	public static void main (String[] args) {
		
		ToLongFunction<Date> tlf = i -> new Date().getTime();
		System.out.println(tlf.applyAsLong(new Date()));
	}
}
