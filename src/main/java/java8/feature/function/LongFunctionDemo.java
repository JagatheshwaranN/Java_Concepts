package java8.feature.function;

import java.util.Date;
import java.util.function.LongFunction;

/**
 * 
 * Function Interface Usage - If we get some input, performing operations on the
 * input and produce results. If the result is of any type and not only boolean,
 * then in such case we should go for Function.
 * 
 * Represents a function that accepts an long-valued argument and produces a
 * result.
 * 
 * interface LongFunction<R> { public R apply (long value); }
 * 
 * R-Return Type
 * 
 * @author Jagatheshwaran N
 *
 */
public class LongFunctionDemo {

	public static void main(String[] args) {

		LongFunction<Date> lf = (i) -> {
			Date d = new Date(i);
			return d;
		};
		System.out.println(lf.apply(new Date().getTime()));
	}
}
