package java9.feature.privatemethods;

public interface Interface2 {

	static void method1() {

		System.out.println("Interface2 Static Method");
		commonMethod();
	}

	default void method2() {

		System.out.println("Interface2 Default Method");
		commonMethod();
	}

	private static void commonMethod() {
		System.out.println("Common functionality code by Private Static Method");
	}
}
