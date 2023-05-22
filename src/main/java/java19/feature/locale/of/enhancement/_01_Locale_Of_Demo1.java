package java19.feature.locale.of.enhancement;

import java.util.Locale;

public class _01_Locale_Of_Demo1 {

	public static void main(String[] args) {

		// Deprecated
		// Locale locale = new Locale();
		
		Locale locale1 = Locale.of("de");
		Locale locale2 = Locale.of("de", "DE");
		System.out.println(locale1 == Locale.GERMAN);
		System.out.println(locale2 == Locale.GERMANY);
	}
}
