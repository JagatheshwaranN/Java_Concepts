package java8.feature.predicate;

import java.util.function.LongPredicate;

/**
 * LongPredicate is used to take input of Long and verify the conditional check.
 * 
 * interface LongPredicate { public boolean test (long value); }
 * 
 * @author Jagatheshwaran N
 *
 */
public class LongPredicateDemo {

	public static void main(String[] args) {

		LongPredicate lp = i -> i > 50000;
		System.out.println(lp.test(2147483650L));

	}

}
