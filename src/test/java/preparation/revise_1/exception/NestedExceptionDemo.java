package preparation.revise_1.exception;

import java.io.IOException;

public class NestedExceptionDemo {

    public static void main(String[] args) throws MyCustomException {
        try {
            openFile("non-existent.txt");
        } catch (IOException e) {
            // Create a new custom exception with the original IOException as the cause
            throw new MyCustomException("Failed to open file", e);
        }
    }

    public static void openFile(String filename) throws IOException {
        // Simulate an error where the file cannot be opened
        throw new IOException("Cannot open file: " + filename);
    }
}

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }

    // Constructor to allow nesting the cause
    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
