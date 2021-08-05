package abstractConcept;

public class TestCar {

	public static void main(String ar[]) {
		BMW b = new BMW();
		b.start();
		b.refuel();
		b.stop();
		b.theftSafety();
		
		Car c = new BMW();
		c.start();
		c.refuel();
		c.stop();
		
	}
}
