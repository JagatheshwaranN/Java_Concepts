package java11.feature.string.enhancements;

import java.util.stream.Collectors;

/**
 * lines() - Return the stream of lines of multi-line string. This method
 * returns a stream of strings, which is a collection of all substrings split by
 * lines.
 * 
 * @author Jagatheshwaran N
 */
public class _06_String_Lines_Demo1 {

	public static void main(String[] args) {

		// Without lines()
		var linesDemo = "This\nis\na\nmultiline\ntext.";
		System.out.println(linesDemo);

		// With lines()
		var lines1 = linesDemo.lines();
		lines1.forEachOrdered(System.out::println);

		var lines2 = linesDemo.lines().collect(Collectors.toList());
		System.out.println(lines2);
	}
}
