package InterfaceConcept;

public interface USMedical extends WHO{
	
	int min_fee = 10;
	public void physioService();
	public void oncologyService();
	public void orthopedicService();
	public void radiologyService();
	
	//Can't create object of Interface
	//Only method declaration -- method prototype -- no method body -- Abstract methods
	//Can't create static prototype method
	//Interface variables are static and final by default
	
	
	// From JDK 1.8, we can declare static methods with method body
	public static void service911() {
		System.out.println("US - 911 service");
	}
	
	default void internShip() {
		System.out.println("US - Internship");
	}

}
