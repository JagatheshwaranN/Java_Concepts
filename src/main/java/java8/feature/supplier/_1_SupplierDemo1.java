package java8.feature.supplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 * 
 * Just supply the required objects and it won’t take any input. Then we should
 * go for Supplier.
 * 
 * Represents a supplier of results.
 * 
 * interface Supplier<R> { public R get (); }
 * 
 * R-ReturnType
 * 
 * @author Jagatheshwaran N
 *
 */
public class _1_SupplierDemo1 {

	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}

}
