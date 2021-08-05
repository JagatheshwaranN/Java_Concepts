package lambdaExpressions;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		// Supplier is a predefined Functional Interface.It doesn't take data of any
		// type but return value of any type.

		Supplier<Date> s1 = () -> new Date();
		System.out.println(s1.get());

		Supplier<String> s2 = () -> System.getProperty("os.name");
		System.out.println(s2.get());

		Supplier<String> s3 = () -> System.getProperty("user.dir");
		System.out.println(s3.get());
		
		Supplier<String> s4 = () -> System.getProperty("user.name");
		System.out.println(s4.get());

	}

}
