package preparation.revise_1.exception;

import java.io.File;
import java.io.IOException;

public class ThrowThrowsExceptionDemo {

    public static void main(String[] args) {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        try {
            exceptionDemo.readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        exceptionDemo.processInput(-1);
    }

    public static class ExceptionDemo {

        public void readFile() throws IOException {
                File file = new File("D:\\Environment_Collection\\Intellij_Env\\Java_Concepts\\src\\test\\java\\preparation\\demo.txt");
                if(file.canRead()){
                    String path = file.getAbsolutePath();
                    System.out.println(path);
                }
                throw new IOException("File Can't Read");
        }

        public void processInput(int number){
            if(number < 0){
                throw new IllegalArgumentException("Input can't be negative");
            }
        }
    }
}
