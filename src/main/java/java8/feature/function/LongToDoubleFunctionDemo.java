package java8.feature.function;

import java.util.function.LongToDoubleFunction;

/**
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that accepts a long-valued argument and produces an
 * double-valued result.
 * 
 * interface LongToDoubleFunction { public R applyAsDouble (long value); }
 * 
 * R-Return Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class LongToDoubleFunctionDemo {
	
	public static void main (String[] args) {
	
		LongToDoubleFunction ltdf = i -> i *1.0;
		System.out.println(ltdf.applyAsDouble(100L));
	}
}
