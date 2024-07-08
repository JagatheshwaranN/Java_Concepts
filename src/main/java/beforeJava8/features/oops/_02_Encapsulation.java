package beforeJava8.features.oops;

public class _02_Encapsulation {

    public static void main(String[] args) {

        /*
            Encapsulation
            =============
            The process of binding the data and corresponding methods into a single unit
            is called as Encapsulation.

            Example,
            class Student {
            data members;
            behaviors ();
            }

            Encapsulation = Data Hiding + Abstraction

            The main advantages of Encapsulation are,
            1.	We can achieve security
            2.	Enhancement will become easy
            3.	It improves the maintainability of the application

            The main disadvantage of the encapsulation is, it increases the length of the code and
            slows down the execution.
        */

        /*
            Tightly Encapsulated Class
            ==========================
            A class is said to be tightly encapsulated, if and only if each and every variable is
            declared as private whether the class contains the corresponding getter and setter methods
            or not. And these methods are declared as public or not. These things we are not required
            to check.

            Note: If the parent class is not tightly encapsulated, then there is no tightly encapsulated
            child class.

            Example,
            class A {
            int x = 10;
            }
            class B extends A
            {
            int y = 20;
            }
        */
    }
}

class Accounts {
    private double balance;
    public double getBalance(){
        return balance;
    }
    public void setBalance(double amount){
        this.balance = amount;
    }
}