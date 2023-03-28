package java11.feature.nested.access;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Java 11 introduced a concept of nested class where we can declare a class
 * within a class. This nesting of classes allows to logically group the classes
 * to be used in one place, making them more readable and maintainable.
 * 
 * Java 11 also provide the concept of nestmate to allow communication and
 * verification of nested classes. JEP 181 extends the JVM's access control
 * mechanisms to allow access to private members of inner classes without
 * synthetic accessors.
 * 
 * Java 11 allows classes and interfaces to be nested within each other. This
 * nested type can be private fields, methods, and constructors.
 * 
 * @author Jagatheshwaran N
 */
public class _01_NestBasedAccessControl_Demo1 {

	public static void main(String[] args) {

		var isNestMate = _01_NestBasedAccessControl_Demo1.class
				.isNestmateOf(_01_NestBasedAccessControl_Demo1.InnerClass.class);

		var isNestHost = _01_NestBasedAccessControl_Demo1.InnerClass.class
				.getNestHost() == _01_NestBasedAccessControl_Demo1.class;

		System.out.println("NestMate ==> " + isNestMate);
		System.out.println("NestHost ==> " + isNestHost);

		Set<String> nestedMembers = Arrays.stream(_01_NestBasedAccessControl_Demo1.InnerClass.class.getNestMembers())
				.map(Class::getName).collect(Collectors.toSet());
		System.out.println(nestedMembers);
	}

	public class InnerClass {
	}
}
