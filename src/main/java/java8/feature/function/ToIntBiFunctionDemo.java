package java8.feature.function;

import java.util.function.ToIntBiFunction;

/**
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that accepts two arguments and produces an int-valued
 * result.
 * 
 * interface ToIntBiFunction<T, U> { public int applyAsInt (T value, U value); }
 * 
 * T-Type & U-Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class ToIntBiFunctionDemo {

	public static void main(String[] args) {

		ToIntBiFunction<String, String> tibf = (s1, s2) -> (s1 + s2).length();
		System.out.println(tibf.applyAsInt("java", "program"));
	}
}
