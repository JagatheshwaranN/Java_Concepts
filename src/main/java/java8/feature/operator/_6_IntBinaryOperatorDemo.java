package java8.feature.operator;

import java.util.function.IntBinaryOperator;

/**
 * 
 * If the input and output is of same type, then we should go for Unary
 * operator. It is a child of Function.
 * 
 * Represents an operation upon two int-valued operands and producing an
 * int-valued result.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _6_IntBinaryOperatorDemo {

	public static void main(String[] args) {

		IntBinaryOperator ibo = (a, b) -> a + b;
		System.out.println(ibo.applyAsInt(10, 20));
	}
}
