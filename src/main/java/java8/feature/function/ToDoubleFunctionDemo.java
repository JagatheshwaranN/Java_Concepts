package java8.feature.function;

import java.util.function.ToDoubleFunction;

/**
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that produces an double-valued result.
 * 
 * interface ToDoubleFunction { public long applyAsDouble (T value); }
 * 
 * T-Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class ToDoubleFunctionDemo {

	public static void main(String[] args) {

		ToDoubleFunction<Integer> tdf = i -> i * 1.0;
		System.out.println(tdf.applyAsDouble(97));
	}
}
