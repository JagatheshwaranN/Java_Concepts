package java8.feature.function;

import java.util.function.IntFunction;

/**
 * 
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that accepts an int-valued argument and produces a
 * result.
 * 
 * interface IntFunction<R> { public R apply (int value); }
 * 
 * R-Return Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class IntFunctionDemo {

	public static void main(String[] args) {
		
		IntFunction<Integer> ifn = i -> i*i;
		System.out.println(ifn.apply(5));
	}

}
