package java7andbelow.features.exception_handling;

import java.io.FileNotFoundException;

public class _06_Exception_CaseScenarios {

    public static void main(String[] args) {

        /*
            Case 1: Normal Flow
            ===================
            No chance of exception and program should run and complete normally.

            Case 2: Exception Handled Normal Flow
            =====================================
            If an exception raised at statement2 and corresponding catch block matched.

            Case 3: Abnormal Flow
            =====================
            If an exception raised at statement2 and corresponding catch block not matched.
        */

        ExCase1Demo demo1 = new ExCase1Demo();
        demo1.method();
        ExCase2Demo demo2 = new ExCase2Demo();
        demo2.method();
        ExCase3Demo demo3 = new ExCase3Demo();
        demo3.method();

        /*
            Points to Remember
            =================
            1.	Within the try block if anywhere the exception is raised then rest of the
                try block won’t be executed even though we handled the exception. Hence,
                inside try block we have to take only the risky code and the length of the
                try block should be as less as possible.

            2.	In addition to try block, there may be a chance of raising of the exception
                inside the catch or finally block.

            3.	If any statement which is not part of try block and raises an exception then
                it’s always abnormal termination.
        */

        /*
            Methods to print Exception Information
            ======================================
            1.	printStackTrace ()
            2.	toString ()
            3.	getMessage ()

            Throwable class defines the following methods to print the exception information.

            Method
            ======
            printStackTrace () -> Name of Exception: Description
                                  Stack Trace
            toString ()        -> Name of Exception: Description
            getMessage ()      -> Description
        */
    }
}

class ExCase1Demo {
    public void method(){
            System.out.println("ExCase1Demo - Statement1");
            System.out.println("ExCase1Demo - Statement2");
            System.out.println("ExCase1Demo - Statement3");
            System.out.println("ExCase1Demo - Statement4");
            System.out.println("ExCase1Demo - Statement5");
    }
}

class ExCase2Demo {
    public void method(){
        System.out.println("ExCase2Demo - Statement1");
        try {
            System.out.println("ExCase2Demo - Statement2" + 10 / 0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("ExCase2Demo - Statement3");
        System.out.println("ExCase2Demo - Statement4");
    }
}

class ExCase3Demo {
    public void method(){
        System.out.println("ExCase3Demo - Statement1");
        try {
            System.out.println("ExCase3Demo - Statement2" + 10 / 0);
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        System.out.println("ExCase3Demo - Statement3");
        System.out.println("ExCase3Demo - Statement4");
    }
}