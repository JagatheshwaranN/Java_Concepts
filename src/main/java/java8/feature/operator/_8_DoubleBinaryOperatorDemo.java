package java8.feature.operator;

import java.util.function.DoubleBinaryOperator;

/**
 * 
 * If the input and output is of same type, then we should go for Unary
 * operator. It is a child of Function.
 * 
 * Represents an operation upon two double-valued operands and producing an
 * double-valued result.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _8_DoubleBinaryOperatorDemo {

	public static void main(String[] args) {

		DoubleBinaryOperator dbo = (a, b) -> a * 1.0 + b * 4.0;
		System.out.println(dbo.applyAsDouble(10.0, 20.0));
	}
}
