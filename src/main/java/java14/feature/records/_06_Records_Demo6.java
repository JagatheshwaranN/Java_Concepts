package java14.feature.records;

public class _06_Records_Demo6 {

	/*
	 * Though records do generate public accessor methods for the fields defined in
	 * the state description, they also allow you to redefine the accessor methods
	 * in the body as shown below.
	 */
	record Author(String authorName, String bookName) {
		public String authorName() {
			return "The book named " + bookName + " was written by " + authorName;
		}
	}

	public static void main(String[] args) {

		var author = new Author("John", "Time Traveller");
		System.out.println(author.authorName());
		System.out.println(author.toString());
	}
}
