package excercises;

import java.text.ParseException;

import java.time.LocalDate;

public class FindFutureDateFromCurrentDate {

	public static void main(String ar[]) throws ParseException {

		LocalDate today = LocalDate.now();
		System.out.println("today : " + today);

		LocalDate twomonthsFromToday = today.plusMonths(2);
		System.out.println("2 months feature date from today : " + twomonthsFromToday);

		LocalDate threemonthsFromToday = today.plusMonths(3);
		System.out.println("3 months feature date from today : " + threemonthsFromToday);

		String convertFeatureMonth = twomonthsFromToday.toString().split("-")[1];
		String convertFeatureYear = twomonthsFromToday.toString().split("-")[0];

		System.out.println("convertFeatureMonth : " + convertFeatureMonth);
		System.out.println("convertFeatureYear : " + convertFeatureYear);

		String convertedFeatureDate = convertFeatureMonth + " " + convertFeatureYear;
		System.out.println("calculatedFeatureDate : " + convertedFeatureDate);
	}
}
