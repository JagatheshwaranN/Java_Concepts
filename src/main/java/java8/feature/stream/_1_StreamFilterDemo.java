package java8.feature.stream;

import java.util.ArrayList;

/***
 * The Streams is used to process the elements from the Collection. It is best
 * helpful to do bulk operations on collection. The stream () method present
 * inside the Collection Interface.
 * 
 * filter() - It is used to check the conditions.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _1_StreamFilterDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(90);
		al.add(70);
		al.add(85);
		al.add(65);
		al.add(45);
		al.add(48);
		
		Object[] s = al.stream().filter(i -> i > 50).toArray();
		for (Object i : s) {
			System.out.println(i);
		}
	}
}
