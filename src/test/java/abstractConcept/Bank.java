package abstractConcept;

public abstract class Bank {

	// Hiding the implementation logic is called abstraction
	// Abstract class can have abstract methods and non abstract methods
	
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;
	
	public abstract void loan();
	
	public void credit() {
		System.out.println("bank -- credit");
	}
	
	public void debit() {
		System.out.println("bank -- debit");
	}
	
	public static void main(String[] args) {
		

	}

}
