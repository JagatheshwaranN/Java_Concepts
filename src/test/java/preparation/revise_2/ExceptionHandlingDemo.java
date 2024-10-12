package preparation.revise_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("All")
public class ExceptionHandlingDemo {

    public static void main(String[] args) throws IOException {
        tryCatchDemo();
        throwDemo();
        throwThrowsDemo();
        tryWithResourcesDemo();
        multiCatchDemo();
        customExceptionDemo();
    }

    private static void tryCatchDemo() throws IOException {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("file.txt"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (bufferedReader != null)
                bufferedReader.close();
        }
    }

    private static void throwDemo() {
        int age = 12;
        if (age < 18)
            throw new IllegalArgumentException("Invalid Age");
    }

    private static void throwThrowsDemo() throws IOException {
        if (true)
            throw new FileNotFoundException();
    }

    private static void tryWithResourcesDemo() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))) {
            System.out.println("File is present.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void multiCatchDemo() {
        try{
            System.out.println(10/0);
            if (true)
                throw new FileNotFoundException();
        } catch (ArithmeticException | IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void customExceptionDemo() {
        int age = 17;
        if(age < 18)
            throw new InvalidAgeException("Age is less than 18.");
    }

}

class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String message) {
        super(message);
    }
}
