package java14.feature.records;

/**
 * There is another more concise variant to override the canonical constructor.
 * You can omit the parameters in the signature and the assignments completely.
 * We call this type a "compact constructor".
 * 
 * @author Jagatheshwaran N
 *
 */
public class _09_Records_Demo9 {

	record Author(String authorName, String bookName) {

		Author {
			System.out.println(authorName());
			System.out.println(authorName);
			System.out.println(bookName());
			System.out.println(bookName);
		}
	}

	public static void main(String[] args) {

		Author author1 = new Author("John", "Time Traveller");
		System.out.println(author1);
	}
}
