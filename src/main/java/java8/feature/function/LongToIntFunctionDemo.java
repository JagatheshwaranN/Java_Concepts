package java8.feature.function;

import java.util.function.LongToIntFunction;

/**
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that accepts a long-valued argument and produces an
 * int-valued result.
 * 
 * interface LongToIntFunction { public R applyAsInt (long value); }
 * 
 * R-Return Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class LongToIntFunctionDemo {

	public static void main(String[] args) {

		LongToIntFunction ltif = i -> (int) i;
		System.out.println(ltif.applyAsInt(1000L));
	}
}
