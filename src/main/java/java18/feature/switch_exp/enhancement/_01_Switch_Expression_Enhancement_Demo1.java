package java18.feature.switch_exp.enhancement;

/**
 * Dominance chekcing of the same type allows to check the dominance of the case
 * label.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Switch_Expression_Enhancement_Demo1 {

	public static void main(String[] args) {
		formatString("Racer");
	}

	@SuppressWarnings("preview")
	private static void formatString(Object obj) {
		/**
		 * This case label is dominated by one of the preceding case label.
		 * 
		 * In the below switch pattern matching, every value that matches the String s
		 * also matches the CharSequence cs, which makes String s unreadable and will
		 * cause a compile-time error.
		 */
//		switch (obj) {
//		case CharSequence cs -> System.out.println("A char sequence of length" + cs.length());
//		case String s -> System.out.println("A string is " + s); // This case label is dominated by one of the preceding
//																	// case label
//		default -> {
//			break;
//		}
//		}
		switch (obj) {
		case String s -> System.out.println("The string is " + s);
		case CharSequence cs -> System.out.println("The char sequence of length" + cs.length());
		default -> {
			break;
		}
		}
	}
}
