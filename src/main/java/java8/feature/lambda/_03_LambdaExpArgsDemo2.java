package java8.feature.lambda;

public class _03_LambdaExpArgsDemo2 {

	public static void main(String[] args) {

		Interface2 reference = (a, b) -> System.out.println("The sum is " + (a + b));
		reference.sum(10, 20);
	}

}
