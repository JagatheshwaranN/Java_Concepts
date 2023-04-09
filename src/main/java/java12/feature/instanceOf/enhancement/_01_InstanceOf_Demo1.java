package java12.feature.instanceOf.enhancement;

/**
 * With Java 12, we can declare the new typecasted variable directly in the
 * statement. The compiler will automatically inject the typecasted String s
 * variable for us.
 * 
 * if (Obj instanceof String s)
 * 
 * @author Jagatheshwaran N
 */
public class _01_InstanceOf_Demo1 {

	public static void main(String[] args) {

		Object value = "Java12 features";
		int strLength = 0;
		if (value instanceof String str) {
			strLength = str.length();
		}
		System.out.println(strLength);
	}

}
