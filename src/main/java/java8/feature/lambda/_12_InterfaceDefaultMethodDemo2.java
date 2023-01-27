package java8.feature.lambda;

public class _12_InterfaceDefaultMethodDemo2 implements Interface4, Interface5 {

	@Override
	public void display() {
		// Our own implementation
		System.out.println("_12_InterfaceDefaultMethodDemo2 class display method");
		// Interface4 default method
		Interface4.super.display();
		// Interface5 default method
		Interface5.super.display();
	}

	public static void main(String[] args) {

		_12_InterfaceDefaultMethodDemo2 object = new _12_InterfaceDefaultMethodDemo2();
		object.display();
	}

}
