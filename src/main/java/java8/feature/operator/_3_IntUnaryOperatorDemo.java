package java8.feature.operator;

import java.util.function.IntUnaryOperator;

/**
 * 
 * If the input and output is of same type, then we should go for Unary
 * operator. It is a child of Function.
 * 
 * Represents an operation on a single int-valued operand that produces an
 * int-valued result.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _3_IntUnaryOperatorDemo {

	public static void main(String[] args) {

		IntUnaryOperator iuo = i -> i * i;
		System.out.println(iuo.applyAsInt(5));
	}
}
