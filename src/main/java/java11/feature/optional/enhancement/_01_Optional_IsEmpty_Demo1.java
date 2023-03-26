package java11.feature.optional.enhancement;

import java.util.Optional;

/**
 * Optional is a container object which may or may not contain a non-null value.
 * If no value is present, the object is considered empty. Previously existing
 * method isPresent() returns true if a value is present, otherwise false.
 * Sometimes, it forces us to write negative conditions which are not readable.
 * 
 * Java 11 introduced new method to Optional class as isEmpty() to check if
 * value is present. isEmpty() returns false if value is present otherwise true.
 * It can be used as an alternative of isPresent() method which often needs to
 * negate to check if value is not present.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Optional_IsEmpty_Demo1 {

	public static void main(String[] args) {

		String name = null;
		System.out.println(Optional.ofNullable(name).isEmpty());
		System.out.println(!Optional.ofNullable(name).isPresent());

		var topic = "Java";
		System.out.println(Optional.ofNullable(topic).isEmpty());
		System.out.println(!Optional.ofNullable(topic).isPresent());
		
		Optional<?> string = Optional.empty();
		System.out.println(string.isEmpty());
	}
}
