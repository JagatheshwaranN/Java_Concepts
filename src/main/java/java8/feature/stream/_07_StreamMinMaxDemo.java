package java8.feature.stream;

import java.util.ArrayList;

public class _07_StreamMinMaxDemo {

	static int minVal;
	static int maxVal;

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(90);
		al.add(70);
		al.add(85);
		al.add(65);
		al.add(45);
		al.add(48);
		
		System.out.println("List's min and max value in asending order...");
		minVal = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		maxVal = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(minVal);
		System.out.println(maxVal);
		
		System.out.println("List's min and max value in descending order...");
		minVal = al.stream().min((i1, i2) -> i2.compareTo(i1)).get();
		maxVal = al.stream().max((i1, i2) -> i2.compareTo(i1)).get();
		System.out.println(minVal);
		System.out.println(maxVal);
	}
}
