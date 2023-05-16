package java19.feature.hashmap.create.method;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Java 19 has new method to create the preallocated hashmap.
 * 
 * @author Jagatheshwaran N
 */
public class _01_HashMap_Create_Method_Demo1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Before Java 19
		Map<String, Integer> map = new HashMap<>(120);

		// From Java 19
		Map<Integer, String> newMap = HashMap.newHashMap(120);
	}
}
