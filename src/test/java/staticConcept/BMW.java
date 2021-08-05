package staticConcept;

public class BMW extends Car{

	@Override
	public void start() {
		System.out.println("BMW -- Start");
	}
	
	public static void stop() {
		System.out.println("BMW -- Stop");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
