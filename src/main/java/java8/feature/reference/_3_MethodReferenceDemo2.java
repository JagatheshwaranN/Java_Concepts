package java8.feature.reference;

interface Calculation {
	
	public void add(int a, int b);
}

public class _3_MethodReferenceDemo2 {

	public void sum(int x, int y) {
		System.out.println("The sum is " + (x + y));
	}

	public static void main(String[] args) {
		
		_3_MethodReferenceDemo2 mrd2 = new _3_MethodReferenceDemo2();
		Calculation c = mrd2::sum;
		c.add(10, 20);
	}
}
