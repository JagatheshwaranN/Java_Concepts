package frequentlyAskedJavaPrograms;

public class CountCharOccurance {

	public static void main(String[] args) {
		String str = "Java Programming Series";
		int count = str.length();
		System.out.println("Original String Length : "+count);
		int countAfterRemove = str.replace("a", "").length();
		int charCount = count - countAfterRemove;
		System.out.println("Number of occurance of a is : "+charCount);
	}
}
