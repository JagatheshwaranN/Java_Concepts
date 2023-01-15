package java8.feature.function;

import java.util.ArrayList;
import java.util.function.BiFunction;

/**
 * BiFunction Interface Usage - If we get two inputs, performing operations on
 * the inputs and produce results. If the result is of any type and not only
 * boolean, then in such case we should go for BiFunction.
 * 
 * Represents a function that accepts two arguments and produces a result.
 * 
 * interface BiFunction <T, U, R> { public R apply (T t, U u); }
 * 
 * @author Jagatheshwaran N
 *
 */

class Worker {
	int wno;
	String wname;

	Worker(int wno, String wname) {

		this.wno = wno;
		this.wname = wname;
	}
}

public class BiFunctionDemo {

	public static void main(String[] args) {

		ArrayList<Worker> al = new ArrayList<Worker>();
		BiFunction<Integer, String, Worker> f = (wno, wname) -> new Worker(wno, wname);
		al.add(f.apply(121, "Alex"));
		al.add(f.apply(122, "John"));

		for (Worker w : al) {
			System.out.println("Worker Number : " + w.wno + " | " + "Worker Name : " + w.wname);
		}
	}
}
