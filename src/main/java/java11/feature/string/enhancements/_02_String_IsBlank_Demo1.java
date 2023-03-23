package java11.feature.string.enhancements;

/**
 * isBlank() - Checks if a string is empty or have white spaces only. It returns a boolean
 * value. Empty Strings and Strings with white spaces are only treated as blank.
 * 
 * @author Jagatheshwaran N
 */
public class _02_String_IsBlank_Demo1 {

	public static void main(String[] args) {

		var whiteSpace = " ";
		var blank = "";
		var topic = "String";
		System.out.println(whiteSpace.isBlank());
		System.out.println(blank.isBlank());
		System.out.println(topic.isBlank());
	}
}
