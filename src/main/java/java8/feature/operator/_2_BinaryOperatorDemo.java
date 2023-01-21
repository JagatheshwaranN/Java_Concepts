package java8.feature.operator;

import java.util.function.BinaryOperator;

/**
 * 
 * If the input and output is of same type, then we should go for Unary
 * operator. It is a child of Function.
 * 
 * Represents an operation upon two operands of the same type, producing a
 * result of the same type as the operands.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _2_BinaryOperatorDemo {

	public static void main(String[] args) {

		BinaryOperator<Integer> bo = (i, j) -> i + j;
		System.out.println(bo.apply(10, 20));

		// maxBy () - This method returns a BinaryOperator which returns the maximum of
		// the two objects passed while calling it based on the given comparator.

		BinaryOperator<Integer> bo1 = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
		System.out.println(bo1.apply(98, 95));

		// minBy () - This method returns a BinaryOperator which return the minimum of
		// the two objects passed while calling it based on the given comparator.
		BinaryOperator<Integer> bo2 = BinaryOperator.minBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
		System.out.println(bo2.apply(98, 95));
	}
}
