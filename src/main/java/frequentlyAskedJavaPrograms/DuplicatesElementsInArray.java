package frequentlyAskedJavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesElementsInArray {

	public static void main(String[] args) {

		DuplicatesElementsInArray duplicates = new DuplicatesElementsInArray();
		duplicates.findDuplicates1();
		duplicates.findDuplicates2();
		duplicates.findDuplicates3();

	}

	public void findDuplicates1() {
		boolean flag = false;
		String ar[] = { "java", "python", "c", "c++", "java", "python" };
		for (int i = 0; i < ar.length; i++) {

			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println("Found duplicate element in an array is " + ar[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Duplicate elements not found in an array");
		}
	}

	public void findDuplicates2() {
		boolean flag = false;
		HashSet<String> lang = new HashSet<String>();
		String ar[] = { "java", "python", "c", "c++", "java", "python" };
		for (String l : ar) {
			if (lang.add(l) == false) {
				System.out.println("Found duplicate element in an array is " + l);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Duplicate elements not found in an array");
		}
	}

	public void findDuplicates3() {
		HashMap<String, Integer> storeMap = new HashMap<String, Integer>();
		String ar[] = { "java", "python", "c", "c++", "java", "python" };

		for (String word : ar) {
			Integer count = storeMap.get(word);
			if (count == null) {
				storeMap.put(word, 1);
			} else {
				storeMap.put(word, ++count);
			}
		}
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Found duplicate element in an array is " + entry.getKey());
			} else {
				System.out.println("Duplicate elements not found in an array");
			}
		}

	}

}
