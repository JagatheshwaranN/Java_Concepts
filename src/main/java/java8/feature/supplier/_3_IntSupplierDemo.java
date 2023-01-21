package java8.feature.supplier;

import java.util.function.IntSupplier;

/**
 * Just supply the required objects and it won’t take any input. Then we should
 * go for Supplier.
 * 
 * Represents a supplier of int-valued results.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _3_IntSupplierDemo {

	public static void main(String[] args) {

		IntSupplier is = () -> {
			
			int number = (int)(Math.random()*1000000);
			return number;
		};
		System.out.println(is.getAsInt());
	}
}
