package java8.feature.operator;

import java.util.function.DoubleUnaryOperator;

/**
 * 
 * If the input and output is of same type, then we should go for Unary
 * operator. It is a child of Function.
 * 
 * Represents an operation on a single double-valued operand that produces an
 * double-valued result.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _5_DoubleUnaryOperatorDemo {
	
	public static void main (String[] args) {
		
		DoubleUnaryOperator duo = i -> i * 1.0;
		System.out.println(duo.applyAsDouble(100.0));
	}
}
