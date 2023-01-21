package java8.feature.operator;

import java.util.function.UnaryOperator;

/**
 * 
 * If the input and output is of same type, then we should go for Unary
 * operator. It is a child of Function.
 * 
 * Represents an operation on a single operand that produces a result of the
 * same type as its operand.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _1_UnaryOperatorDemo {

	public static void main(String[] args) {

		UnaryOperator<Integer> uo = i -> i * i;
		System.out.println(uo.apply(5));

		// identity() - Returns a unary operator that always returns its input argument.
		UnaryOperator<Boolean> uo2 = UnaryOperator.identity();
		System.out.println(uo2.apply(true));
	}
}
