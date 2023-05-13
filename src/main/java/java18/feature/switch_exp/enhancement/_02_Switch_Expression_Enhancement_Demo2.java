package java18.feature.switch_exp.enhancement;

/**
 * Exhaustiveness of switch expressions and statements. The switch expression
 * requires all possible values to be handled in the switch block, else prompts
 * a compile-time error.
 * 
 * @author Jagatheshwaran N
 */
public class _02_Switch_Expression_Enhancement_Demo2 {

	public static void main(String[] args) {
		System.out.println(checkExp("John"));
	}

	@SuppressWarnings("preview")
	private static int checkExp(Object obj) {
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		// A switch expression should have a default case
//		return switch (obj) {
//		case String s -> s.length();
//		case Integer i -> i;
//		};

		return switch (obj) {
		case String s -> s.length();
		case Integer i -> i;
		default -> 0;
		};
	}
}
