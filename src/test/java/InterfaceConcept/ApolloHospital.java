package InterfaceConcept;

public class ApolloHospital  extends GlobalPatientData implements USMedical,UKMedical,IndianMedical{

	@Override
	public void physioService() {
		System.out.println("AP - Physio");		
	}

	@Override
	public void oncologyService() {
		System.out.println("AP - Oncology");
	}

	@Override
	public void orthopedicService() {
		System.out.println("AP - Orthopedic");
	}

	@Override
	public void entService() {
		System.out.println("AP - ENT");
	}

	@Override
	public void ambulanceService() {
		System.out.println("AP - Ambulance");
	}

	@Override
	public void emergencyService() {
		System.out.println("AP - Emergency");
	}

	@Override
	public void neuroService() {
		System.out.println("AP - Neuro");
	}

	@Override
	public void pediatricService() {
		System.out.println("AP - Pediatric");
	}
	
	public void optService() {
		System.out.println("AP - OPT");
	}
	
	public void medicalInsurance() {
		System.out.println("AP - Medical Insurance");
	}
	
	public void pathalogyService() {
		System.out.println("AP - Pathalogy");
	}

	@Override
	public void radiologyService() {
		System.out.println("AP - Radiology");
		
	}

	@Override
	public void polioService() {
		System.out.println("AP - Polio");
		
	}

	

}
