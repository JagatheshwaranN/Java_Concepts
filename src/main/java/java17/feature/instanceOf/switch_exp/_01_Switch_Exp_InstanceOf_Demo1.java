package java17.feature.instanceOf.switch_exp;
/**
 * Through JDK Enhancement Proposal 406, checking whether an object is an
 * instance of a particular class can also be written as a switch statement (or
 * expression). This is another step toward pattern matching by enhancing
 * pattern matching for switch expressions and statements. It reduces the
 * boilerplate necessary to define those expressions and improves the
 * expressiveness of the language. The switch statement is enhanced to match
 * expressions with multiple patterns. Each pattern has a specific operation, so
 * complex data patterns can be expressed concisely and safely.
 * @author Jagatheshwaran N
 */

public class _01_Switch_Exp_InstanceOf_Demo1 {

    public static void main(String[] args) {
        System.out.println(formatString("Java 17"));
        System.out.println(formatString(17));
    }

    @SuppressWarnings("preview")
	private static String formatString(Object obj){
        return switch(obj){
            case Integer i -> String.format("Int %d", i);
            case String s -> String.format("String %s", s);
            case Long l -> String.format("Long %d", l);
            case Double d -> String.format("Double %f", d);
            default -> obj.toString();
        };
    }
}
