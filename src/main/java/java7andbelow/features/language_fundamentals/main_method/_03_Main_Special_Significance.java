package java7andbelow.features.language_fundamentals.main_method;

public class _03_Main_Special_Significance {

    public static void main(String[] args) {

        /*
        Points to Remember
        ==================
            1.	Until Java 1.6 version, if the class does not contain the main method then we will get the runtime
                exception saying NoSuchMethodError: main. But from 1.7 version instead of NoSuchMethod Error, we will
                get the more elaborated error message as Error: Main method not found in class Test, Please declare
                the main method as public static void main(String[] args).

                Now, the latest message as below,
                "Error: Main method not found in class Test, please define the main method as:
                 public static void main(String[] args)
                 or a JavaFX application class must extend javafx.application.Application"

            2.	From Java 1.7 version onwards, main method is mandatory to start program execution. Hence, even though
                the class contain the static block it won’t be executed if the class does not contain main method. But
                in Java 1.6 version, the static block will get execute and throw the Runtime Exception for main method.
                class Test {
                static {
                SOP("Static block");
                }
                }
                Java 1.6 => Static block execution and NoSuchMethodError.
                Java 1.7 => Error: Main method not found in class Test.

                class Test {
                static {
                SOP("Static block");
                System.exit(0);
                }
                }
                Java 1.6 => Static block.
                Java 1.7 => Error: Main method not found in class Test.

            Execution flow until Java 1.6
            =============================
            1.	Identification of Static members
            2.	Execute the static block and static variable assignment
            3.	Check for main method
            4.	If main available, execute
            5.	If main not available, throw Runtime Exception

            Execution flow from Java 1.7
            ============================
            1.	Check for main method
            2.	If main available, Identification of Static members
            3.	Execute the static block and static variable assignment
            4.	Execute main method
            5.	If main not available, throw Runtime Exception

            Ques: Without writing the main method, is it possible to print some statements to the console?

            Yes, by using Static block until Java 1.6 version. But from Java 1.7 version onwards, it is impossible
            to print the statement to the console without writing the main method.
        */
    }
}
