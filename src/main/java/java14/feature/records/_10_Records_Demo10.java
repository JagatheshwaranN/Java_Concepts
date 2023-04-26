package java14.feature.records;

public class _10_Records_Demo10 {

	class InnerClass {

		record Author(String authorName, String bookName) {
			Author {
				System.out.println(authorName);
				System.out.println(bookName);
			}
		}
	}

	public static void main(String[] args) {
		InnerClass.Author author1 = new InnerClass.Author("John", "Time Traveller");
		System.out.println(author1);
	}
}
