package java14.feature.records;

import java.lang.reflect.RecordComponent;

public class _07_Records_Demo7 {

	record Author(String authorName, String bookName) {
	}

	public static void main(String[] args) {

		var author = new Author("John", "Time Traveller");
		System.out.println(author.authorName());
		System.out.println(author.bookName());
		System.out.println(author.toString());
		System.out.println(author.getClass().isRecord());
		RecordComponent[] recordComponents = author.getClass().getRecordComponents();
		for (RecordComponent recordComponent : recordComponents) {
			System.out.println(recordComponent);
		}
	}
}
