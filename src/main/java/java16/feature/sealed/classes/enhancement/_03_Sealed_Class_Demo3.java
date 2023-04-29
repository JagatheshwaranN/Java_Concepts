package java16.feature.sealed.classes.enhancement;

/**
 * In Java16, In the second preview of Sealed Classes is that local classes
 * (that is, classes defined within methods) are not allowed to extend sealed
 * classes.
 * 
 * @author Jagatheshwaran N
 */
public class _03_Sealed_Class_Demo3 {

	public static void main(String[] args) {

	}
}

sealed class Car {

	public static void display() {

//		final class BMW extends Car { // Compile Time Error
//
//		}
	}
}

final class Audi extends Car {

}
