package java8.feature.predicate;

import java.util.function.IntPredicate;

/**
 * IntPredicate is used to take input of type Int and verify the conditional
 * check.
 * 
 * interface IntPredicate { public boolean test (int value); }
 * 
 * @author Jagatheshwaran N
 *
 */
public class _6_IntPredicateDemo {

	public static void main(String[] args) {

		IntPredicate ip = i -> i % 2 == 0;
		System.out.println(ip.test(10));
		System.out.println(ip.test(15));
	}

}
