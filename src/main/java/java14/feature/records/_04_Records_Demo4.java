package java14.feature.records;

interface Detail {
	String getDetail();
}

public class _04_Records_Demo4 {

	record Author(String authorName, String bookName) implements Detail {

		@Override
		public String getDetail() {
			return "Author " + authorName + " has written the book " + bookName;
		}
	}

	public static void main(String[] args) {

		var author = new Author("John", "Inner Engineering");
		System.out.println(author.getDetail());
		System.out.println(author.toString());
	}
}
