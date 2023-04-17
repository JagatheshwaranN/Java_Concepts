package java14.feature.instanceOf.enhancement;

/**
 * With Java 14, we can declare the new typecasted variable directly in the
 * statement. The compiler will automatically inject the typecasted String s
 * variable for us.
 * 
 * if (Obj instanceof String s)
 * 
 * @author Jagatheshwaran N
 */
public class _01_InstanceOf_Demo1 {

	public static void main(String[] args) {

		Object value = "Java14 features";
		if (value instanceof String str && str.length() > 5) {
			System.out.println(str.toUpperCase());
			System.out.println(str.length());
		} else {
			System.out.println("The condition doesn't met!!");
		}

	}

}
