package java8.feature.lambda;

public class _02_LambdaExpNoArgDemo1 {

	public static void main(String[] args) {
		Interface1 reference = () -> System.out.println("Implementing the display method with Lambda Expression");
		reference.display();
	}

}
