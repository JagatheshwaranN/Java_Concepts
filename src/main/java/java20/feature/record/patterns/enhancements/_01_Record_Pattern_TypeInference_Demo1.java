package java20.feature.record.patterns.enhancements;

public class _01_Record_Pattern_TypeInference_Demo1 {

	public static void main(String[] args) {

		testRecord(new Box<String>("Java19"));
	}

	record Box<T>(T t) {
	}

	@SuppressWarnings("preview")
	private static void testRecord(Box<String> box) {
		if (box instanceof Box<String>(var val)) {
			System.out.println("The value is " + val);
		}
	}
}
