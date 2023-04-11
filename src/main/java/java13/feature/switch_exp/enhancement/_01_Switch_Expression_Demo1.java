package java13.feature.switch_exp.enhancement;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * JEP 325 introduced switch expressions as a preview in Java 12. switch can be
 * used as a statement or as an expression since then. "Expression" means that
 * switch returns a value. Based on feedback from the developer community, JDK
 * Enhancement Proposal 354 replaces the break keyword in switch expressions
 * with the new yield keyword.
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
		case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> {
			yield "Week Day";
		}
		case "SATURDAY", "SUNDAY" -> {
			yield "Weekend";
		}
		default -> {
			yield "Invalid Day";
		}
		};
		return today;
	}

}
