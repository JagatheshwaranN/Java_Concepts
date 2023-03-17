package java10.feature.var;

import java.util.List;

public class _02_VarDemo2 {

	public static void main(String[] args) {

		var topics = List.of("Java", "JSP", "Servlet", "JDBC", "Srping", "Hibernate");
		for (var topic : topics) {
			System.out.println("The topic is : " + topic);
		}
	}
}
