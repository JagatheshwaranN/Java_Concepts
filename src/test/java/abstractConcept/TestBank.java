package abstractConcept;

public class TestBank {

	public static void main(String ar[]) {

		HDFC hdfc = new HDFC();
		hdfc.credit();
		hdfc.debit();
		hdfc.loan();
		hdfc.funds();

		Bank b = new HDFC();
		b.credit();
		b.debit();
		b.loan();
	}

}
