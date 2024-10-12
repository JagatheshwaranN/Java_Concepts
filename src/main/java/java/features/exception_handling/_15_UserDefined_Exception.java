package java.features.exception_handling;

import java.util.Scanner;

public class _15_UserDefined_Exception {

    public static void main(String[] args) {

        /*
            User Defined / Customized Exception
            ===================================
            Sometimes, to meet the programming requirements we can define our own exceptions.
            Such type of exceptions is called as customized or user defined exceptions.

            Example,
            1.	TooYoungException
            2.	TooOldException
            3.	InsufficientFundsException
        */

        /*
            Note:
            =====
            1.	Throw keyword is the best suitable for user defined or customized exceptions
                but not for predefined exceptions.
            2.	It's highly recommended to define the customized exception as unchecked exception
                i.e., we have to extends RuntimeException but not Exception.
        */

        CustomizedException.customizedExceptionDemo();
    }
}

class YoungException extends RuntimeException {
    YoungException(String message){
        super(message);
    }
}

class OldException extends RuntimeException {
    OldException(String message){
        super(message);
    }
}

class CustomizedException {

    public static void customizedExceptionDemo(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if(age >= 60)
            throw new OldException("You have crossed the marriage age");
        else if(age <= 18)
            throw new YoungException("You have not reached the marriage age");
        else
            System.out.println("You are eligible for marriage");
    }
}