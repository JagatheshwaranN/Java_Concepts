package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		
		ApolloHospital ap = new ApolloHospital();
		ap.ambulanceService();
		ap.emergencyService();
		ap.entService();
		ap.internShip();
		ap.polioService();
		ap.patientData();
		System.out.println(USMedical.min_fee);
	
		//Top casting / Up casting
		USMedical us = new ApolloHospital();  // Child class object referred by Parent Interface reference variable
		us.oncologyService();
		us.orthopedicService();
		us.physioService();
		USMedical.service911();
		
		
		

	}

}
