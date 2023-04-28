package java16.feature.instanceOf.enhancement;

/**
 * Pattern variables are no longer implicitly final, i.e., they can be changed.
 * The following code is allowed in Java 16; in Java 15, it led to a "pattern
 * binding may not be assigned" compiler error.
 * 
 * @author Jagatheshwaran N
 */
public class _02_InstanceOf_Demo2 {

	public static void main(String[] args) {

		Object value = "Java16 Pattern Matching";
		if (value instanceof String str && str.length() > 5) {
			str = str.toUpperCase(); // Compiler error in Java 15, allowed in Java 16
			System.out.println(str);
		}
	}
}
