package frequentlyAskedJavaPrograms;

public class FinalConcepts {

	@SuppressWarnings("unused")
	public static void main(String ar[]) {
		
		FinalConcepts f1 = new FinalConcepts();		
		f1 = null;
		start();
		test();
		System.gc();
	}

	public void finalize() {
		System.out.println("Inside finalize method");
	}
	
	public static final void start() {
		final int i = 10;
		System.out.println("Value of i : " + i);
		System.out.println("This is final start method inside final sample class");
	}
	
	public static void test() {
		try {
			System.out.println("Inside test method");
			//throw new RuntimeException();
		} finally {
			System.out.println("Inside finally block");
		}
	}
	
	

}
