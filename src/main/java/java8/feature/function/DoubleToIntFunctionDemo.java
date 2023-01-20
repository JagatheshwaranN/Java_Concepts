package java8.feature.function;

import java.util.function.DoubleToIntFunction;

/**
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that accepts a double-valued argument and produces an
 * int-valued result.
 * 
 * interface DoubleToIntFunction { public R applyAsInt (double value); }
 * 
 * R-Return Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class DoubleToIntFunctionDemo {

	public static void main(String[] args) {

		DoubleToIntFunction dtif = i -> (int) i;
		System.out.println(dtif.applyAsInt(10.5));
	}
}
