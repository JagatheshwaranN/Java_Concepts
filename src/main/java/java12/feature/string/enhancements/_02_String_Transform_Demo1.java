package java12.feature.string.enhancements;

import java.math.BigDecimal;

/**
 * transform() - The new transform() method applies an arbitrary function to a
 * String and returns the function's return value. The advantage of
 * String.transform() is that the function to be applied can be determined
 * dynamically at runtime.
 * 
 * @author Jagatheshwaran N
 */
public class _02_String_Transform_Demo1 {

	public static void main(String[] args) {

		var upperCase = "java".transform(String::toUpperCase);
		System.out.println(upperCase);
		var number = "12345".transform(Integer::valueOf);
		System.out.println(number);
		BigDecimal decimal = "1234567891011121314151617181920".transform(BigDecimal::new);
		System.out.println(decimal);
		var text = "Optimistic";
		var transformedText = text.transform(value -> new StringBuilder(value).reverse().toString());
		System.out.println(transformedText);
	}
}
