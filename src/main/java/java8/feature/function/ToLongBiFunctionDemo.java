package java8.feature.function;

import java.util.function.ToLongBiFunction;

/**
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that accepts two arguments and produces an long-valued
 * result.
 * 
 * interface ToLongBiFunction<T, U> { public long applyAsLong (T value, U value); }
 * 
 * T-Type & U-Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class ToLongBiFunctionDemo {
	
	public static void main (String[] args) {
	
		ToLongBiFunction<String, String> tlbf = (x, y) -> Long.parseLong(x)+Long.parseLong(y);
		System.out.println(tlbf.applyAsLong("10000000", "100000000"));
	}
}
