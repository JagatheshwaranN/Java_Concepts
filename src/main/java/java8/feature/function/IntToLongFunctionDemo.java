package java8.feature.function;

import java.util.function.IntToLongFunction;

/**
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that accepts an int-valued argument and produces a
 * long-valued result.
 * 
 * interface IntToLongFunction { public R applyAsLong (int value); }
 * 
 * R-Return Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class IntToLongFunctionDemo {
	
	public static void main (String[] args) {
	
		IntToLongFunction itlf = i -> i*10000000;
		System.out.println(itlf.applyAsLong(25));
	}
}
