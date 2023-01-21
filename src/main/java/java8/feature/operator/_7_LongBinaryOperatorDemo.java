package java8.feature.operator;

import java.util.function.LongBinaryOperator;

/**
 * 
 * If the input and output is of same type, then we should go for Unary
 * operator. It is a child of Function.
 * 
 * Represents an operation upon two long-valued operands and producing an
 * long-valued result.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _7_LongBinaryOperatorDemo {

	public static void main(String[] args) {

		LongBinaryOperator lbo = (x, y) -> x + y;
		System.out.println(lbo.applyAsLong(1000L, 2000L));
	}
}
