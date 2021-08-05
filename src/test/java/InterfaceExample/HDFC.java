package InterfaceExample;

public class HDFC implements Bank {

	public static void main(String[] args) {
	
	}

	@Override
	public void serviceCharge() {
		System.out.println("Service charge : "+ 50);
	}

	@Override
	public void notMaintainFundPenality() {
		System.out.println("Not Maintain Fund Penality charge : "+ 100);
	}

}
