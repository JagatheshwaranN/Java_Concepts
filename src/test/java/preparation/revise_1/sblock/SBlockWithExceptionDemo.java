package preparation.revise_1.sblock;

public class SBlockWithExceptionDemo {

    static {
        try{
            System.out.println("Static Block");
            int i = 10 / 0;
        }catch(ArithmeticException e){
            System.out.println("Captured Arithmetic Exception");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
