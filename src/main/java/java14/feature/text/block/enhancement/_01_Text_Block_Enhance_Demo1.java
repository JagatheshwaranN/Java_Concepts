package java14.feature.text.block.enhancement;

/**
 * Java 13 introduces text blocks to handle multiline strings like JSON/XML/HTML
 * etc as is a preview feature. With Java 14, we've second preview of Text
 * Blocks. Now Text Block have following enhancements,
 * 
 * \ - indicates an end of the line in case new line is to be started.
 * 
 * \s - indicates a single space.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Text_Block_Enhance_Demo1 {

	public static void main(String[] args) {

		var text1 = """
				Does you know \
				java 14 \
				has new features
				""";

		var text2 = """
				line1
				line2\s
				line3
				""";

		var text3 = "line1\nline2 \nline3\n";

		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text2.equals(text3));
	}
}
