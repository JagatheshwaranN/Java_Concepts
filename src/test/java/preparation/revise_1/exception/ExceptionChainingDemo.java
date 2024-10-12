package preparation.revise_1.exception;

public class ExceptionChainingDemo {

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            Throwable originalCause = e.getCause();
            if(originalCause != null){
                System.out.println("Original Cause : "+ originalCause.getMessage());
            }
        }
    }

    public static void methodA() throws Exception {
        try {
            methodB();
        } catch (Exception e) {
            throw new Exception("Exception occurred in method A", e);
        }
    }

    public static void methodB() throws Exception {
        throw new Exception("Exception occurred in method B");
    }
}
