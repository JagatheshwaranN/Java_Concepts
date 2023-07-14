package java7andbelow.features.oops;

public class _01_Data_Hiding_Abstraction {

    public static void main(String[] args) {

        /*
            Data Hiding
            ===========
            1. Outside person can’t access our internal data directly or our internal data should not go out
               directly. This OOPs feature is called as Data Hiding.

            2. After validation/authentication, outside person can access our internal data.

            Example,
            1.	After providing the proper username and password, we can access the Gmail account information.
            2.	Even though, we are valid customer of the bank, we can access our account information only,
                and we can’t access others account information.

            By declaring the data member (variable) as Private, we can achieve Data Hiding.

            The main advantage of the data hiding is Security.

            Note: It’s highly recommended to declare the data member as Private.
        */

        /*
            Abstraction
            ===========
            Hiding the internal implementation and just highlight the set of services what we are offering
            is the concept of Abstraction.

            Example., Through bank ATM GUI screen, the banking people are highlighting the set of services
                      what they are offering without highlighting the internal implementation.

            Advantages
            ==========
            1.	We can achieve Security because we are not highlighting our internal implementation.
            2.	Without affecting the outside person, we can perform any changes to the internal system
                and hence enhancement will become easy.
            3.	It improves the maintainability of the application.
            4.	It improves the easiness to use the system.

            By using Interfaces and Abstract classes, we can implement the Abstraction.
        */
    }
}

class Account {
    private double balance;

    public double getBalance(){
        return balance;
    }
}
