package java12.feature.compact.number;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Java 12 comes with a new number formatter, the CompactNumberFormat. It's
 * designed to represent a number in a shorter form, based on the patterns
 * provided by a given locale. We can get its instance via the
 * getCompactNumberInstance method in NumberFormat class,
 * 
 * public static NumberFormat getCompactNumberInstance(Locale locale,
 * NumberFormat.Style formatStyle)
 * 
 * As mentioned before, the locale parameter is responsible for providing proper
 * format patterns. The format style can be either SHORT or LONG. We can create
 * a formatter for the so-called "compact number formatting". This is a form
 * that is easy for humans to read, such as "2M" or "3 billion".
 * 
 * @author Jagatheshwaran N
 */
public class _01_CompactNumberFormat_Demo1 {

	public static void main(String[] args) {

		NumberFormat nfShort = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		NumberFormat nfLong = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		
		System.out.println("Short Form of 1000 ==> "+ nfShort.format(1000));
		System.out.println("Long Form of 1000 ===> "+ nfLong.format(1000));
		
		System.out.println("Short Form of 2000000 ==> "+ nfShort.format(2000000));
		System.out.println("Long Form of 2000000 ===> "+ nfLong.format(2000000));
		
		System.out.println("Short Form of 3456789000 ==> "+ nfShort.format(3456789000L));
		System.out.println("Long Form of 3456789000 ===> "+ nfLong.format(3456789000L));

	}

}
