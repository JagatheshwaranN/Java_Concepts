package java15.feature.records.enhancement;

import java.lang.reflect.Field;

/**
 * In Java 14, it was possible to change the final fields of a record via
 * reflection. But from Java 15, The implicitly declared fields corresponding to
 * the record components of a record class are final and you can no longer
 * change a record's fields using reflection.
 * 
 * In Java 15, this attempt results in an IllegalAccessException.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _01_Records_Enhancement_Demo1 {

	record Circle(int x, int y) {
	}

	public static void main(String[] args) {

		Circle c = new Circle(3, 5);
		int x = c.x();
		int y = c.y();
		System.out.println(x);
		System.out.println(y);
		int newX = 5;
		Field X = null;
		try {
			X = Circle.class.getDeclaredField("x");
			X.setAccessible(true);
			X.set(c, newX);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}
}
