package java8.features;

public class LambdaExpArgsDemo2 {

	public static void main(String[] args) {

		Interface2 reference = (a, b) -> System.out.println("The sum is " + (a + b));
		reference.sum(10, 20);
	}

}
