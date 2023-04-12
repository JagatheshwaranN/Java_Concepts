package java13.feature.text.block;

/**
 * To define a multiline string, we used to use escape sequences for line breaks
 * and double quotes contained in the string. Java 13 introduces text blocks to
 * handle multiline strings like JSON/XML/HTML etc. It is a preview feature.
 * Text Block allows to write multiline strings easily without using \r\n.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Text_Block_Demo1 {

	public static void main(String[] args) {

		var text_json = """
				{
				   "name" : "John",
				   "email" : "john@gmail.com"
				}

				""";
		System.out.println(text_json);
		System.out.println(text_json.contains("John"));
		System.out.println(text_json.indexOf("John"));
		System.out.println(text_json.length());
		System.out.println("*********************************************");
		var text_html = """
				<html>
					<head>
						<link href='/css/style.css' rel='stylesheet' />
					</head>
					<body>
						<h1>Hello World</h1>
					</body>
				</html>
				""";
		System.out.println(text_html);
		System.out.println("*********************************************");
		var text_sql = """
				SELECT id, firstName, lastName FROM Employee
				WHERE departmentId = "IT"
				ORDER BY firstName
				""";
		System.out.println(text_sql);
	}
}
