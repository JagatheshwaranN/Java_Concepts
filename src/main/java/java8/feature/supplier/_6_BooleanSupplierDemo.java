package java8.feature.supplier;

import java.util.Date;
import java.util.function.BooleanSupplier;

/**
 * Just supply the required objects and it won’t take any input. Then we should
 * go for Supplier.
 * 
 * Represents a supplier of boolean-valued results.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _6_BooleanSupplierDemo {
	
	public static void main (String[] args) {
		
		BooleanSupplier bs = () -> new Date().getTime()+10 > new Date().getTime();
		System.out.println(bs.getAsBoolean());
	}
}
