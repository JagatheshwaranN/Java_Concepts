package java8.feature.supplier;

import java.util.Date;
import java.util.function.LongSupplier;

/**
 * Just supply the required objects and it won’t take any input. Then we should
 * go for Supplier.
 * 
 * Represents a supplier of long-valued results.
 * 
 * @author Jagatheshwaran N
 *
 */
public class LongSupplierDemo {

	public static void main(String[] args) {

		LongSupplier ls = () -> new Date().getTime();
		System.out.println(ls.getAsLong());
	}

}
