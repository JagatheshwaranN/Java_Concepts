package frequentlyAskedJavaPrograms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		duplicateWords("Hi! Java is best Java programming language");
		duplicateWords("100 200 300 100");
	}

	public static void duplicateWords(String input) {

		String[] words = input.split(" ");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for (String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}

		Set<String> wordsInString = wordCount.keySet();
		for (String w : wordsInString) {
			if (wordCount.get(w) > 1) {
				System.out.println(w + " : " + wordCount.get(w));
			}
		}
	}
}
