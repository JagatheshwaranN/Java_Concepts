package java12.feature.switch_exp.enhancement;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Java 12 introduces expressions to Switch statement and released it as a
 * preview feature. Following are the changes introduced in case of new switch
 * with expressions.
 * 
 * 1. No fall through. 2. No break statement required to prevent fall through.
 * 3. A single case can have multiple constant labels. 4. Default case is
 * compulsory now.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Switch_Expression_Demo1 {

	public static void main(String[] args) {

		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		System.out.println(dayOfWeek.toString());
		System.out.println(getDayDetail(dayOfWeek.toString()));
	}

	public static String getDayDetail(String day) {

		String today = switch (day) {
		case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Week Day";
		case "SATURDAY", "SUNDAY" -> "Weekend";
		default -> "Invalid Day";
		};
		return today;
	}
}
