package java8.feature.stream;

import java.util.ArrayList;

/***
 * The Streams is used to process the elements from the Collection. It is best
 * helpful to do bulk operations on collection. The stream () method present
 * inside the Collection Interface.
 * 
 * forEach() - It is used to perform the operations for each elements in the stream.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _05_StreamForEachDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(90);
		al.add(70);
		al.add(85);
		al.add(65);
		al.add(45);
		al.add(48);
		
		al.stream().filter(i -> i > 50).forEach(System.out::println);
	}
}
