package java19.feature.switch_exp.enhancement;

/**
 * In Java 19, JDK Enhancement Proposal 427 changed the syntax of the so-called
 * "Guarded Pattern". Instead of &&, we now have to use the new keyword when
 * clause.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Switch_Exp_Enhancement_Demo1 {

	public static void main(String[] args) {

		testSwitchExp("Java19SwitchExpEnhacement");
		testSwitchExp("Java19");
	}

	@SuppressWarnings("preview")
	private static void testSwitchExp(Object obj) {
		switch (obj) {
		case String str when str.length() > 10 -> System.out.println("String length greater than 10");
		case String str -> System.out.println("String length " + str.length());
		case default -> {
		}
		}
	}
}
