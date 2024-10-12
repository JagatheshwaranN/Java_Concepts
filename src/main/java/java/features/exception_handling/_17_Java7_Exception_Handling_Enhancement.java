package java.features.exception_handling;

import java.io.*;

public class _17_Java7_Exception_Handling_Enhancement {
    public static void main(String[] args) {

        /*
            Java 1.7 version Enhancements WRT Exception Handling
            ====================================================
            As a part of Java 1.7 version, in exception handling, the following 2 concepts
            are introduced.
            1.	Try with Resources
            2.	Multi Catch Block

            Try with Resources
            ==================
            Until Java 1.6 version, it's highly recommended to write the finally block to
            close the resources which are opened as part of the try block.

            The problems in the above approach are, the programmers are compulsory have to
            close the resources opened as part of the try, and it increases the complexity
            of the program. We have to write the finally block compulsory which increases
            the length of the code and reduces the code readability.

            To overcome this problem, SUN people introduced Try with Resources in 1.7 version
            of Java. The advantage of the Try with Resources is whatever resources we opened
            as part of try block will be closed automatically once the control reaches the end
            of the try block either normally or abnormally. Hence, we are not required to
            close the resource explicitly. So, that the complexity of the program is reduced.
            We are not required to write the finally block so that length of the code is
            reduced and readability is improved.
        */

        /*
            Conclusion
            ==========
            1.	We can declare multiple resources, but these resources should be separated
                with semicolon (;).
                try (R1; R2; R3) {
                }

            2.	All resources should be AutoCloseable resources. A resource is said to be
                AutoCloseable if and only if corresponding class implements java.lang.AutoCloseable
                Interface. All IO related resources, DB related resources, and Network related
                resources are already implemented AutoCloseable Interface. Being a programmer,
                we don't need to do anything. AutoCloseable Interface came in 1.7 version of Java,
                and it's contains only one method close ().

            3.	All resource reference variables are implicitly Final and hence within the try
                block we can't perform the reassignment. Otherwise, we will get the compile
                time error.

                CE: AutoCloseable resource br may not be assigned.

            4.	Until Java 1.6 version, try should be associated with either catch or finally.
                But from Java 1.7 version onwards, we can take only try with resource without
                catch or finally.
                try (R)
                {
                }

            5.	The main advantage of try with resource is we are not required to write the
                finally block explicitly because we are not required to close the resource
                explicitly.
        */
    }
}
class TryCatchDemo {
    public void method() throws IOException {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("input.txt"));
        }catch(IOException e){
            System.out.println("Handling Code");
        }
        finally {
            if(br != null){
                br.close();
            }
        }
    }
}

class TryWithResourceDemo {
    public void method() {
        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
            System.out.println("BufferedReader Code");
        }catch(IOException e){
            System.out.println("Handling Code");
        }
    }
}

class Conclusion1Demo {
    public void method() {
        try (FileWriter fw = new FileWriter("Output.txt");
             FileReader fr = new FileReader("Input.txt")) {
            System.out.println("Try Block");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Conclusion3Demo {
    public void method() {
        try (BufferedReader br1 = new BufferedReader (new FileReader("input.txt"))){
            // auto-closeable resource br1 may not be assigned
            // br1 = new BufferedReader (new FileReader("output.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Conclusion4Demo {
    public void method() throws IOException {
        try (BufferedReader br1 = new BufferedReader (new FileReader("input.txt"))){
            System.out.println("Try Without Catch or Finally");
        }
    }
}