package programPractice_July_2021;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StringBuffer_Builder_Sorting implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		
		System.out.println(o1.toString().compareTo(o2.toString()));
		return o1.toString().compareTo(o2.toString());
	}

	public static void main(String str[]) {
		Set<StringBuffer> strBufObj = new TreeSet<>(new StringBuffer_Builder_Sorting());
		strBufObj.add(new StringBuffer("Mohan"));
		strBufObj.add(new StringBuffer("Muthu"));
		strBufObj.add(new StringBuffer("Arun"));
		strBufObj.add(new StringBuffer("Jaga"));
		System.out.println("Sorted elements : " + strBufObj);
	}
}
