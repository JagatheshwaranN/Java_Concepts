package java8.feature.function;

import java.util.function.Function;

/**
 * 
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that accepts one argument and produces a result.
 * 
 * interface Function<T, R> { public R apply (T t); }
 * 
 * T-Type & R-Return Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class FunctionDemo1 {

	public static void main(String[] args) {

		Function<Integer, Integer> f = n -> n * n;
		int sqauredNum = f.apply(4);
		System.out.println(sqauredNum);

	}

}
