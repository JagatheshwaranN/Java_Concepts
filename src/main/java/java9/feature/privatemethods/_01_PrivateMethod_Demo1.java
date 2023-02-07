package java9.feature.privatemethods;

/**
 * In java 1.9, we can have private (instance & static) methods inside the
 * interface. If we want to achieve code reusability without affecting the
 * functionality of the interface and the implemented classes. Then, we should
 * go for Private Method.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _01_PrivateMethod_Demo1 implements Interface1 {

	public static void main(String[] args) {

		Interface1 iReference = new _01_PrivateMethod_Demo1();
		iReference.method1();
		iReference.method2();
	}
}
