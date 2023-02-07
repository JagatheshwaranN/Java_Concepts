package java9.feature.privatemethods;

public class _02_PrivateMethod_Demo2 implements Interface2 {

	public static void main(String[] args) {

		Interface2 iReference = new _02_PrivateMethod_Demo2();
		iReference.method2();
		Interface2.method1();
	}

}
