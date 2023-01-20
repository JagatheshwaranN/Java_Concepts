package java8.feature.predicate;

import java.util.function.BiPredicate;

/**
 * BiPredicate interface is used for conditional check and it accept more than
 * one input.
 * 
 * interface BiPredicate <T1, T2> { public boolean test (T1 t1, T2 t2); }
 * 
 * @author Jagatheshwaran N
 *
 */
public class _5_BiPredicateDemo {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;
		System.out.println(p.test(10, 20));
		System.out.println(p.test(15, 20));
	}

}
