package java14.feature.records;

public class _02_Records_Demo2 {

	record Author(int bookId, String authorName, String bookName) {

		static int followers = 0;

		public static String followerCount() {
			return "Followers count " + followers;
		}

		public String details() {
			return "Author " + authorName + " has published a book called " + bookName;
		}

		public Author {
			if (bookId < 0) {
				throw new IllegalArgumentException("id must be greater than 0.");
			}
		}
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Author author = new Author(101, "John", "Time Traveller");
		System.out.println(author.bookId());
		System.out.println(author.authorName());
		System.out.println(author.bookName());
		System.out.println(author.followerCount());
		System.out.println(author.details());
		System.out.println(author.hashCode());
		System.out.println(author.toString());
	}
}
