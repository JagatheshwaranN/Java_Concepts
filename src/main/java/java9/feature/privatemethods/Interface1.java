package java9.feature.privatemethods;

public interface Interface1 {
	
	public default void method1() {
		
		System.out.println("Interface1 Default Method 1");
		commonMethod();
	}
	
	default void method2() {
		
		System.out.println("Interface1 Default Method 2");
		commonMethod();
	}
	
	private void commonMethod() {
		System.out.println("Common functionality code by Private Method");
	}
}
