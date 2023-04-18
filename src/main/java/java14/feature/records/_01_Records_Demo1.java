package java14.feature.records;

/**
 * The first new preview feature in Java 14 is Records, defined in JDK
 * Enhancement Proposal 359.
 * 
 * Records were introduced to reduce repetitive boilerplate code in data model
 * POJOs. They simplify day to day development, improve efficiency and greatly
 * minimize the risk of human error.
 * 
 * Records improves developer productivity by providing a compact syntax for
 * declaring classes which act as transparent carriers for immutable data. New
 * class called as record (AKA data class), it is final class, not abstract, and
 * all of its fields are final as well.
 * 
 * As we can see, we are making use of a new keyword, record, here. This simple
 * declaration will automatically add a constructor, getters, equals, hashCode
 * and toString methods for us.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Records_Demo1 {

	record AuthenticateUser(String username, String password) {
	}

	public static void main(String[] args) {

		AuthenticateUser authenticateUser = new AuthenticateUser("admin", "password");
		System.out.println(authenticateUser.username());
		System.out.println(authenticateUser.password());
	}
}
