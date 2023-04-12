package java13.feature.text.block;

/**
 * Text Block string have same methods as string like contains(), indexOf() and
 * length() functions.
 * 
 * formatted(Object… args): It’s similar to the String format() method. It’s
 * added to support formatting with the text blocks.
 * 
 * stripIndent(): Used to remove the incidental white space characters from the
 * beginning and end of every line in the text block. This method is used by the
 * text blocks and it preserves the relative indentation of the content.
 * 
 * translateEscapes(): Returns a string whose value is this string, with escape
 * sequences translated as if in a string literal.
 * 
 * @author Jagatheshwaran N
 */
public class _02_Text_Block_Demo2 {

	public static void main(String[] args) {

		var text_format = """
				Name: %s
				Phone: %d
				Salary: %.2f
				""".formatted("John", 1234567890, 95000.0055);

		System.out.println(text_format);
		System.out.println("*********************************************");
		var text_strip = "<html>   \n" + "\t<body>\t\t \n" + "\t\t<p>Hello</p>  \t \n" + "\t</body> \n" + "</html>";
		System.out.println(text_strip);
		System.out.println(text_strip.replace(" ", "*"));
		System.out.println(text_strip.stripIndent());
		System.out.println("*********************************************");
		var text_escape = "Hi\t\nHello' \" /u0022 John\r";
		System.out.println(text_escape);
		System.out.println(text_escape.translateEscapes());
	}
}
