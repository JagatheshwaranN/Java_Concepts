package nullConcept;

public class NullConcept {

	static Object obj;
	static String str;
	static NullConcept nc;

	public static void main(String[] args) {

		// Case sensitive
		Object ob = null;

		System.out.println(obj);
		System.out.println(str);
		System.out.println(nc);

		// Compiler will not allow to assign value to primitive data type
		Integer i = null;
		// int j = i;

		Integer j = null;
		Integer k = 10;
		System.out.println(j instanceof Integer);
		System.out.println(k instanceof Integer);

		NullConcept obj = null;
		obj.send();
		// obj.sum();

		String s1 = (String) null;
		System.out.println(s1 + "John");
		// System.out.println(s1.length());
		// System.out.println(s1.charAt(0));

		System.out.println(null != null);
		System.out.println(null == null);
	}

	public static void send() {
		System.out.println("Send...");
	}

	public void sum() {
		System.out.println("Sum...");
	}

}
