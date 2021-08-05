package InterfaceExample;

public class ICICI implements Bank {

	public static void main(String[] args) {
	}

	@Override
	public void serviceCharge() {
		System.out.println("Serivce charge : "+ 100);

	}

	@Override
	public void notMaintainFundPenality() {
		System.out.println("Not Maintain Fund Penality charge : "+ 200);

	}

}
