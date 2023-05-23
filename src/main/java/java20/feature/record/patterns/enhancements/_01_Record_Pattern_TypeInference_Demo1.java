package java20.feature.record.patterns.enhancements;

/**
 * A record pattern can use var to match against a record component without stating the type of the component.
 * In that case the compiler infers the type of the pattern variable introduced by the var pattern.
 * For example, the pattern Point(var a, var b) is shorthand for the pattern Point(int a, int b).
 *
 * The set of pattern variables declared by a record pattern includes all of the
 * pattern variables declared in the record component pattern list.
 *
 * An expression is compatible with a record pattern if it could be cast to the record type
 * in the pattern without requiring an unchecked conversion.
 *
 * If a record class is generic then it can be used in a record pattern as either a parameterized
 * type or as a raw type.
 *
 * @author Jagatheshwaran N
 */
public class _01_Record_Pattern_TypeInference_Demo1 {

	public static void main(String[] args) {

		testRecord(new Box<String>("Java19"));
	}

	record Box<T>(T t) {
	}

	//Before Java 20
//	private static void testRecord(Box<String> box) {
//		if (box instanceof Box<String>(String val)) {
//			System.out.println("The value is " + val);
//		}
//	}

	//From Java 20
	private static void testRecord(Box<String> box) {
//		if (box instanceof Box(var val)) {
//			System.out.println("The value is " + val);
//		}
	}

}
