package java8.feature.stream;

import java.util.ArrayList;

/***
 * The Streams is used to process the elements from the Collection. It is best
 * helpful to do bulk operations on collection. The stream () method present
 * inside the Collection Interface.
 * 
 * count() - It is used to count the stream objects.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _04_StreamCountDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(90);
		al.add(70);
		al.add(85);
		al.add(65);
		al.add(45);
		al.add(48);
		
		long count = al.stream().filter(i -> i < 50).count();
		System.out.println(count);
	}
}
