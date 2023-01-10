package java8.features;

public class WithLambdaExpression {
	
	public static void main(String[] args) {
		Interface1 reference = ()-> System.out.println("Implementing the display method with Lambda Expression");
		reference.display();
	}

}
