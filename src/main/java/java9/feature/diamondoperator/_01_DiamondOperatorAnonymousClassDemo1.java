package java9.feature.diamondoperator;

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
