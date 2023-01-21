package java8.feature.operator;

import java.util.function.LongUnaryOperator;

/**
 * 
 * If the input and output is of same type, then we should go for Unary
 * operator. It is a child of Function.
 * 
 * Represents an operation on a single long-valued operand that produces an
 * long-valued result.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _4_LongUnaryOperatorDemo {

	public static void main(String[] args) {

		LongUnaryOperator luo = i -> i * 10;
		System.out.println(luo.applyAsLong(10000000));
	}
}
