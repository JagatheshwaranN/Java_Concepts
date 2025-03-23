package preparation._ip;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionConcept {

    public static void main(String[] args) throws IOException {
        checkedException();
        uncheckedException();
        throwsDemo();
        throwDemo();
    }

    private static void checkedException() {
        try{
            Thread.sleep(500);
            System.out.println("exception");
        }catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void uncheckedException() {
        try{
            int x = 10/0;
        } catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void throwsDemo() throws IOException {
        FileReader fileReader = new FileReader("src/test/java/preparation/_ip/data/data.txt");
        fileReader.close();
    }

    @SuppressWarnings("ConstantValue")
    private static void throwDemo(){
        int age = 10;
        if(age >= 18)
        {
            System.out.println("Correct Age");
        }else {
            throw new IllegalArgumentException("Age should be greater or equal to 18");
        }
    }

}
