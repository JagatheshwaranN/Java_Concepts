package java8.features;

public interface Interface7 {
	 
	void m1();
	
	default void m2() {
		System.out.println("Interface default method");
	}
	
	static void m3() {
		System.out.println("Interface static method");
	}

}
