package java9.feature.diamondoperator;

interface Welcome<T> {

	public T greeting(T t);
}

public class _02_DiamondOperatorAnonymousClassDemo2 {

	public static void main(String[] args) {

		Welcome<String> welcome = new Welcome<>() {

			@Override
			public String greeting(String t) {
				return "Hi!! " + t + ", Welcome to Java9 features learning session!!";
			}
		};
		String person = welcome.greeting("John");
		System.out.println(person);
	}
}
