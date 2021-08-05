package frequentlyAskedJavaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingArrayList {

	public static void main(String[] args) {

		ArrayList<String> languages = new ArrayList<String>();
		languages.add("tamil");
		languages.add("telugu");
		languages.add("kanada");
		languages.add("malayalam");

		// 1. Using java 8 feature for each loop and lambda expression
		languages.forEach(lang -> {
			System.out.println(lang);
		});
		System.out.println("-----------------");
		// 2. Using Iterator
		Iterator<String> itr = languages.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------");
		// 3. Using Iterator and Java 8 ForEach Remaining
		itr = languages.iterator();
		itr.forEachRemaining(lang -> {
			System.out.println(lang);
		});
		System.out.println("-----------------");
		// 4. Using ForEach loop
		for (String lang : languages) {
			System.out.println(lang);
		}
		System.out.println("-----------------");
		// 5. Using For loop
		for (int i = 0; i < languages.size(); i++) {
			System.out.println(languages.get(i));
		}
		System.out.println("-----------------");
		// 6. Using List Iterator
		ListIterator<String> ltItr = languages.listIterator(languages.size());
		while (ltItr.hasNext()) {
			System.out.println(ltItr.next());

			System.out.println("-----------------");
		}
	}
}
