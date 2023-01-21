package java8.feature.function;

import java.util.function.DoubleToLongFunction;

/**
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that accepts a double-valued argument and produces an
 * long-valued result.
 * 
 * interface DoubleToLongFunction { public R applyAsLong (double value); }
 * 
 * R-Return Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class DoubleToLongFunctionDemo {

	public static void main(String[] args) {

		DoubleToLongFunction dtlf = i -> (long) i;
		System.out.println(dtlf.applyAsLong(10000000.0));
	}

}
