package Java16.feature.instanceOf.enhancement;

/**
 * A matched variable is only visible within the if block. That is logical,
 * because only if the if comparison is positive, the variable can be cast to
 * the desired type.
 * 
 * If a field with the same name exists within the class, then this field is
 * "shadowed" by a pattern matching variable.
 * 
 * @author Jagatheshwaran N
 */
public class _01_InstanceOf_Demo1 {

	public static void main(String[] args) {

		new _01_InstanceOf_Demo1().processObject("Happy Coding!");
	}

	private String str = "Hello, World!";

	private void processObject(Object obj) {
		System.out.println(str);
		if (obj instanceof String str) {
			System.out.println(str);
			System.out.println(this.str);
		}
	}

	/**
	 * It is not allowed to give a pattern matching variable the same name as a
	 * variable already defined in the method, as in the following code.
	 */
//	private void processObject1(Object obj) {
//		String str = "Hello, World!";
//		System.out.println(str);
//		if (obj instanceof String str) { // Compile Time Error
//			System.out.println(str);
//			System.out.println(this.str);
//		}
//	}

}
