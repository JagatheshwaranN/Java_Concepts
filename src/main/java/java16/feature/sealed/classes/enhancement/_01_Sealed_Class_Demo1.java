package java16.feature.sealed.classes.enhancement;

/**
 * In the Java Language Specification (JLS), the concept of "contextual
 * keywords" replaces the previous "restricted identifiers" and "restricted
 * keywords". "Contextual keywords ensure that new keywords such as sealed,
 * permits (or yield from the switch expressions) may continue to be used
 * outside the respective context, e.g., as variable or method names.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Sealed_Class_Demo1 {

	public static void main(String[] args) {
		sealed();
	}
	
	public static void sealed() {
		int permits = 5;
		System.out.println(permits);
	}
}
