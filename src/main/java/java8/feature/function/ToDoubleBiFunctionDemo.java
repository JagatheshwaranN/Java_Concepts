package java8.feature.function;

import java.util.function.ToDoubleBiFunction;

/**
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that accepts two arguments and produces an double-valued result.
 * 
 * interface ToDoubleFunction<T, U> { public double applyAsDouble (T value, U
 * value); }
 * 
 * T-Type & U-Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class ToDoubleBiFunctionDemo {

	public static void main(String[] args) {

		ToDoubleBiFunction<Integer, Integer> tdbf = (a, b) -> a * 1.0 + b * 1.0;
		System.out.println(tdbf.applyAsDouble(50, 100));
	}
}
