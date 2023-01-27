package java8.feature.lambda;

class Implementation implements Interface1 {

	@Override
	public void display() {
		System.out.println("Implementing the display method without Lambda Expression using Implementation Class");	
	}	
}

public class _01_WithoutLambdaExpression {
	
	public static void main(String[] args) {	
		Implementation object = new Implementation();
		object.display();
	}	
}
