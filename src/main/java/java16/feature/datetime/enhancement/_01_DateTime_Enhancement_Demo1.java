package java16.feature.datetime.enhancement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * A new addition to the DateTimeFormatter is the period-of-day symbol "B",
 * which provides an alternative to the am/pm format. With the DateTimeFormatter
 * class, you can format date values of the Java Date/Time API, e.g., LocalDate,
 * LocalTime, LocalDateTime, or Instant, Year, and YearMonth.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _01_DateTime_Enhancement_Demo1 {

	public static void main(String[] args) {

		// Before Java16
		System.out.println(
				DateTimeFormatter.ofPattern("EEE, MMMM d, yyyy h:mm a", Locale.US).format(LocalDateTime.now()));

		// After Java16
		System.out.println(
				DateTimeFormatter.ofPattern("EEE, MMMM d, yyyy h:mm B", Locale.US).format(LocalDateTime.now()));

		// https://www.baeldung.com/java-datetimeformatter
	}
}
