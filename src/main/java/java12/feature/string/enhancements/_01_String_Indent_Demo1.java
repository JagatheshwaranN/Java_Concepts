package java12.feature.string.enhancements;

/**
 * indent() - The indent adjusts the indentation of each line based on the
 * integer parameter. If the parameter is greater than zero, new spaces will be
 * inserted at the beginning of each line. On the other hand, if the parameter
 * is less than zero, it removes spaces from the begging of each line. If a
 * given line does not contain sufficient white space, then all leading white
 * space characters are removed.
 * 
 * 
 * @author Jagatheshwaran N
 */
public class _01_String_Indent_Demo1 {

	public static void main(String[] args) {

		var contents = "This is java12 \narticle about features \nand enhancements";
		System.out.println("*** Contents without Indent ***" + "\n" + contents);
		System.out.println("***********************************************");
		System.out.println("*** Contents with +ve Indent ***" + "\n" + contents.indent(5));
		System.out.println("***********************************************");
		System.out.println("*** Contents with 0 Indent ***" + "\n" + contents.indent(0));
		System.out.println("***********************************************");
		System.out.println("*** Contents with -ve Indent ***" + "\n" + contents.indent(-2));
		System.out.println("***********************************************");
	}
}
