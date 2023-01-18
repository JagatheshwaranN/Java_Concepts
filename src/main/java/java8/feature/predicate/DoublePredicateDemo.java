package java8.feature.predicate;

import java.util.function.DoublePredicate;

/**
 * DoublePredicate is used to take input of type Double and verify the
 * conditional check.
 * 
 * interface DoublePredicate { public boolean test (double value); }
 * 
 * @author Jagatheshwaran N
 *
 */
public class DoublePredicateDemo {

	public static void main(String[] args) {

		DoublePredicate dp = i -> i + 100 > 200.00;
		System.out.println(dp.test(150.00));
	}
}
