package java14.feature.records;

public class _08_Records_Demo8 {

	record Author(String authorName, String bookName) {
		
		private static int instanceCounter = 0;

		public static int getInstanceCounter() {
			return instanceCounter;
		}
		public static void setInstanceCounter(int instanceCounter) {
			Author.instanceCounter = instanceCounter;
		}
		
		Author(String authorName, String bookName) {
			this.authorName = authorName;
			this.bookName = bookName;
			
			synchronized (Author.class) {
				setInstanceCounter(getInstanceCounter() + 1);
			}
		}
	}

	public static void main(String[] args) {

		Author author1 = new Author("John", "Time Traveller");
		Author author2 = new Author("Alex", "Inner Engineering");
		System.out.println(author1);
		System.out.println(author2);
		System.out.println(Author.getInstanceCounter());

	}
}
