package java11.feature.lambda.var;

/**
 * In Java 11, we can use var with lambda expression parameters to avoid using
 * the type name with the variable name.
 * 
 * @author Jagatheshwaran N
 */
public class _01_LocalVarInLambda_Demo1 {

	public static void main(String[] args) {

		calc c = (var x, var y) -> {
			return (x + y);
		};
		int sum = c.add(2, 3);
		System.out.println(sum);
	}
}

interface calc {
	public int add(int a, int b);
}
