package java11.feature.string.enhancements;

/**
 * stripTrailing() - It is the enhanced version of trim (). Removes the trailing
 * whitespaces. It is used to remove the white space at end of the string.
 * 
 * @author Jagatheshwaran N
 */
public class _05_String_StripTrailing_Demo3 {

	public static void main(String[] args) {

		var stripDemo = "	 	strip	 	";
		System.out.println("Before Strip Operation");
		System.out.print("|");
		System.out.print(stripDemo);
		System.out.println("|");
		System.out.println("After Strip Operation");
		System.out.print("|");
		System.out.print(stripDemo.stripTrailing());
		System.out.println("|");
	}
}
