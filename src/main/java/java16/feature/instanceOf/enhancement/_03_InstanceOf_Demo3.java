package java16.feature.instanceOf.enhancement;

public class _03_InstanceOf_Demo3 {

	public static void main(String[] args) {

		Integer value = 10;
		if (value instanceof Number n) {
			System.out.println(n);
		}
	}
}
