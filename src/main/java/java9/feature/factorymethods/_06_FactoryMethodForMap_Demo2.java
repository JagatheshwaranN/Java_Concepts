package java9.feature.factorymethods;

import java.util.Map;

/**
 * Map interface includes static method Map.ofEntries(), which can be used when
 * we have to add more than 10 elements of key value pairs.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _06_FactoryMethodForMap_Demo2 {

	public static void main(String[] args) {

		Map.Entry<Integer, String> e1 = Map.entry(101, "Diamond Operator");
		Map.Entry<Integer, String> e2 = Map.entry(102, "Factory Methods");
		Map.Entry<Integer, String> e3 = Map.entry(103, "G1 Garbage Collector");
		Map.Entry<Integer, String> e4 = Map.entry(104, "HTTP/2 client");
		Map.Entry<Integer, String> e5 = Map.entry(105, "JLink");
		Map.Entry<Integer, String> e6 = Map.entry(106, "Java Platform Module System");
		Map.Entry<Integer, String> e7 = Map.entry(107, "Jshell");
		Map.Entry<Integer, String> e8 = Map.entry(108, "Private Methods");
		Map.Entry<Integer, String> e9 = Map.entry(109, "Process API enhancements");
		Map.Entry<Integer, String> e10 = Map.entry(110, "Safe VarArg annotations");
		Map.Entry<Integer, String> e11 = Map.entry(111, "Stream API enhancements");
		Map.Entry<Integer, String> e12 = Map.entry(112, "Try With Resource");

		Map<Integer, String> topics = Map.ofEntries(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);
		topics.entrySet().stream().forEach(System.out::println);
	}
}
