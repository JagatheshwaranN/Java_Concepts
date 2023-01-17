package java8.feature.supplier;

import java.util.function.DoubleSupplier;

/**
 * Just supply the required objects and it won’t take any input. Then we should
 * go for Supplier.
 * 
 * Represents a supplier of double-valued results.
 * 
 * @author Jagatheshwaran N
 *
 */
public class DoubleSupplierDemo {

	public static void main(String[] args) {

		DoubleSupplier ds = () -> {
			double number;
			number = Math.PI;
			return number;
		};
		System.out.println(ds.getAsDouble());
	}
}
