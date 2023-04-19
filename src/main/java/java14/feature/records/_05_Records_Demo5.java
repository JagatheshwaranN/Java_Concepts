package java14.feature.records;

public class _05_Records_Demo5 {

	record Author(String authorName, String bookName) {

		Author() {
			this("NA", "NA");
		}

		Author(String authorName) {
			this(authorName, "NA");
		}
	}

	public static void main(String[] args) {

		var author1 = new Author();
		System.out.println(author1.toString());

		var author2 = new Author("John");
		System.out.println(author2.toString());

		var author3 = new Author("John", "Time Traveller");
		System.out.println(author3.toString());
	}
}
