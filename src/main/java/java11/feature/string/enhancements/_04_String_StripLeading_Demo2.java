package java11.feature.string.enhancements;

/**
 * stripLeading() - It is the enhanced version of trim (). Removes the leading
 * whitespaces. It is used to remove the white space at beginning of string.
 * 
 * @author Jagatheshwaran N
 */
public class _04_String_StripLeading_Demo2 {

	public static void main(String[] args) {

		var stripDemo = "	 	strip	 	";
		System.out.println("Before Strip Operation");
		System.out.print("|");
		System.out.print(stripDemo);
		System.out.println("|");
		System.out.println("After Strip Operation");
		System.out.print("|");
		System.out.print(stripDemo.stripLeading());
		System.out.println("|");
	}
}
