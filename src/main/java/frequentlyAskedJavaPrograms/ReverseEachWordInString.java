package frequentlyAskedJavaPrograms;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		ReverseEachWordInString reverse = new ReverseEachWordInString();
		reverse.reverseWordsInString1();
		reverse.reverseWordsInString2();
	}

	public void reverseWordsInString1() {
		String input = "Welcome to java";
		System.out.println("The words in string before reverse is : " + input);
		String words[] = input.split(" ");
		String reverseString = "";

		for (String word : words) {
			String reverseWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + word.charAt(i);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println("The reverse of each word in string is : " + reverseString);
	}

	public void reverseWordsInString2() {
		String input = "Welcome to java";
		System.out.println("The words in string before reverse is : " + input);
		String words[] = input.split("\\s");
		String reverseWord = "";
		for (String word : words) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			reverseWord = reverseWord + sb.toString() + " ";
		}	
		System.out.println("The reverse of each word in string is : " + reverseWord);
	}

}
