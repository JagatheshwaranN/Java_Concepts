package java8.feature.stream;

import java.util.ArrayList;

public class _8_StreamToArrayDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(90);
		al.add(70);
		al.add(85);
		al.add(65);
		al.add(45);
		al.add(48);
		
		Integer[] a = al.stream().toArray(Integer[]::new);
		for(int a1 : a) {
			System.out.println(a1);
		}
	}
}
