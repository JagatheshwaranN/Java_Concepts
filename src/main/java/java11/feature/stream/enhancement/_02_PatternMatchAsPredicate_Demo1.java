package java11.feature.stream.enhancement;

import java.util.regex.Pattern;

/**
 * The asMatchPredicate() method will create a predicate if the pattern matches
 * with the input string. It returns true if the string matches else returns
 * false.
 * 
 * @author Jagatheshwaran N
 */
public class _02_PatternMatchAsPredicate_Demo1 {

	public static void main(String[] args) {

		var pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$").asMatchPredicate();
		System.out.println(pattern.test("john.alex@gmail.com"));
		System.out.println(pattern.test("john?alex@gmail.com"));
	}
}
