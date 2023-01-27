package java8.feature.lambda;

public class _04_LambdaExpReturnStmtDemo3 {

	public static void main(String[] args) {
		
		Interface3 reference = n -> n * n;
		int squaredNumber = reference.squareIt(5);
		System.out.println("The square of the given number is " + squaredNumber);
	}

}
