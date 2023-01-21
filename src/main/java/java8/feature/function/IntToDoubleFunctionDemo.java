package java8.feature.function;

import java.util.function.IntToDoubleFunction;

/**
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that accepts an int-valued argument and produces a
 * double-valued result.
 * 
 * interface IntToDoubleFunction { public R applyAsDouble (int value); }
 * 
 * R-Return Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class IntToDoubleFunctionDemo {
	
	public static void main (String[] args) {
		
		IntToDoubleFunction itdf = i -> i *1.0;
		System.out.println(itdf.applyAsDouble(95));
	}
}
