package java14.feature.records;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_Records_Demo3 {

	record Author(String authorName, List<String> bookName) {
	}

	public static void main(String[] args) {

		var booksName = new ArrayList<String>(Arrays.asList("Inner Engineering"));
		var author = new Author("John", booksName);
		System.out.println(author.toString());
		booksName.add("Time Traveller");
		System.out.println(author.bookName());
		System.out.println(author.toString());
	}
}
