package java8.feature.function;

import java.util.function.ToIntFunction;

/**
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that produces an int-valued result.
 * 
 * interface ToIntFunction { public int applyAsInt (T value); }
 * 
 * T-Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class ToIntFunctionDemo {

	public static void main(String[] args) {

		ToIntFunction<String> tif = s -> s.length();
		System.out.println(tif.applyAsInt("Java"));
	}
}
