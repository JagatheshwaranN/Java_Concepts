package java8.feature.stream;

import java.util.ArrayList;

/***
 * The Streams is used to process the elements from the Collection. It is best
 * helpful to do bulk operations on collection. The stream () method present
 * inside the Collection Interface.
 * 
 * map() - It is used to do manipulation on the stream objects.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _02_StreamMapDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(90);
		al.add(70);
		al.add(85);
		al.add(65);
		al.add(45);
		al.add(48);
		
		Object[] s = al.stream().filter(i -> i < 50).map(i -> i + 5).toArray();
		for (Object s1 : s) {
			System.out.println(s1);
		}
	}
}
