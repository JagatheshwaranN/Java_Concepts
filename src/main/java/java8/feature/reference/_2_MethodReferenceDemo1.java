package java8.feature.reference;

/**
 * 
 * For Lambda Expressions, we have alternate syntax such as Method reference.
 * 
 * The advantage of using the Method reference is code reusability. The
 * restriction wrt Method Reference is, the argument type must be matched with
 * original method which is being bypassed. But, the return type can be
 * different and need not be same.
 * 
 * ClassName::MethodName
 * ObjectReference::MethodName
 * 
 * @author Jagatheshwaran N
 *
 */
public class _2_MethodReferenceDemo1 {

	public static void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {

		Runnable r = _2_MethodReferenceDemo1::run;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
