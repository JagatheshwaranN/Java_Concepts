package java8.feature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/***
 * The Streams is used to process the elements from the Collection. It is best
 * helpful to do bulk operations on collection. The stream () method present
 * inside the Collection Interface.
 * 
 * collect() - It is used to collec the stream objects into list.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _03_StreamCollectDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(90);
		al.add(70);
		al.add(85);
		al.add(65);
		al.add(45);
		al.add(48);
		
		List<Integer> al2 = al.stream().filter(i -> i > 50).collect(Collectors.toList());
		System.out.println(al2);
	}
}
