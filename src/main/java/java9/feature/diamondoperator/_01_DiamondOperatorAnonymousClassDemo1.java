package java9.feature.diamondoperator;

/**
 * Type inference is a feature of Java that was introduced in Java 7. Now, Java
 * compiler can infer type of a data automatically. In Java 9, Java team
 * improved its type inference feature and allowed us to use (diamond) in the
 * anonymous class.
 * 
 * @author Jagatheshwaran N
 *
 * @param <T>
 */
abstract class BasicCalculator<T> {

	public abstract T add(T t1, T t2);
}

public class _01_DiamondOperatorAnonymousClassDemo1 {

	public static void main(String[] args) {

		BasicCalculator<Integer> basiCalculator = new BasicCalculator<>() {

			@Override
			public Integer add(Integer a, Integer b) {
				return a + b;
			}
		};
		Integer sum = basiCalculator.add(10, 20);
		System.out.println(sum);
	}
}
