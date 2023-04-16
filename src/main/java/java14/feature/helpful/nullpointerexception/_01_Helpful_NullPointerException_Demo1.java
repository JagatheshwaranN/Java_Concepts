package java14.feature.helpful.nullpointerexception;

/**
 * Java 14 introduces NullPointerException with helpful information. Null
 * Pointer Exceptions are a nightmare for any developer. Previously, until Java
 * 13, it was tricky to debug the infamous NPEs. Developers had to fall onto
 * other debugging tools or manually figure the variable/method that was null
 * since the stack trace would only show the line number. Java 14 introduced a
 * new JVM feature which gives better insights with a more descriptive stack.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _01_Helpful_NullPointerException_Demo1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		int []arr = null;
		arr[0] = 1;
		System.out.println(arr[0]);
	}
}
