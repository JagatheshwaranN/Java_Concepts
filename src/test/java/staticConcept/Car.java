package staticConcept;

public class Car {

	
	public void start() {
		System.out.println("Car -- Start");
	}
	
	//Method hiding
	public static void stop() {
		System.out.println("Car -- Stop");
	}
	
	public static void stop(int speed) {
		System.out.println("Car -- Stop");
	}
	
	public static void main(String[] args) {
		
		

	}

}
