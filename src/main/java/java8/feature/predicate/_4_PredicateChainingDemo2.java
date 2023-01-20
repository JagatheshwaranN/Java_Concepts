package java8.feature.predicate;

import java.util.function.Predicate;

public class _4_PredicateChainingDemo2 {

	public static void main(String[] args) {

		int[] x = { 5, 10, 15, 20, 25, 30 };

		Predicate<Integer> p1 = i -> i % 2 == 0;
		// Predicate<Integer> p2 = I -> I > 10;
		for (int x1 : x) {
			if (p1.negate().test(x1)) {
				System.out.println(x1);
			}
		}
	}

}
