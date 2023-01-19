package java8.feature.function;

import java.util.function.DoubleFunction;

/**
 * 
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that accepts an double-valued argument and produces a
 * result.
 * 
 * interface DoubleFunction<R> { public R apply (double value); }
 * 
 * R-Return Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class DoubleFunctionDemo {

	public static void main(String[] args) {

		DoubleFunction<Integer> df = i -> (int)(i*10);
		System.out.println(df.apply(9.8));
	}
}
