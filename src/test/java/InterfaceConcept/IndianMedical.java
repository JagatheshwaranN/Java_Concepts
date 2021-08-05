package InterfaceConcept;

public interface IndianMedical {

	public void emergencyService();
	public void neuroService();
	public void pediatricService();
	public void radiologyService();
	
	public static void dengueService() {
		System.out.println("Indian - dengue service");
	}
}
