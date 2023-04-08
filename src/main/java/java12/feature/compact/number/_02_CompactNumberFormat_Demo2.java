package java12.feature.compact.number;

import java.text.NumberFormat;
import java.util.Locale;

public class _02_CompactNumberFormat_Demo2 {

	public static void main(String[] args) {

		NumberFormat nfShort = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		nfShort.setMaximumFractionDigits(1);
		NumberFormat nfLong = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		nfLong.setMaximumFractionDigits(2);
		System.out.println("Short Form of 2592 ==> " + nfShort.format(2592));
		System.out.println("Long Form of 2023 ===> " + nfLong.format(2023));


	}

}
