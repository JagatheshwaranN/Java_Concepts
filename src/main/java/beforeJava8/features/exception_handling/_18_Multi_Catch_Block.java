package beforeJava8.features.exception_handling;

public class _18_Multi_Catch_Block {

    public static void main(String[] args) {

        /*
            Multi Catch Block
            =================
            Until Java 1.6 version, even though multiple different exceptions having same
            handling code for every exception type we have to write a separate catch block.
            It increases the length of the code and reduces the readability.

            try {
            }
            catch (ArithmeticException ex) {
            ex. printStackTrace ();
            }
            catch (IOException ex) {
            ex. printStackTrace ();
            }
            catch (NullPointerException ex) {
            ex. getMessage ();
            }
            catch (InterruptedException ex) {
            ex. getMessage ();
            }

            To overcome this problem, the SUN people introduced Multi Catch Block in Java 1.7
            version, according to this we can write single catch block that can handle multiple
            different types of exception.

            try {
            }
            catch (ArithmeticException | IOException ex) {
            ex. printStackTrace ();
            }
            catch (NullPointerException | InterruptedException ex) {
            ex. getMessage ();
            }

            The main advantage of this approach is, the length of the code is reduced and
            readability of the code is improved.

            In multi catch block there should not be any relation between the exception
            types (Either Child-Parent, Parent-Child, or Same Type). Otherwise, we will
            get the compile time error.
        */
        MultiCatchDemo.method1();
        MultiCatchDemo.method2();
    }
}
class MultiCatchDemo {
    public static void method1() {
        try {
            System.out.println(10/0);
            String s = null;
            System.out.println(s.length());
        } catch(ArithmeticException | NullPointerException ex){
            ex.printStackTrace();
        }
    }

    public static void method2() {
        try {
            System.out.println(10/0);
            String s = null;
            System.out.println(s.length());
        } catch(Exception ex){
            // catch(ArithmeticException | Exception ex){
            // Alternatives in a multi-catch statement cannot be related by subclassing
            //  Alternative java.lang.ArithmeticException is a subclass of alternative java.lang.Exception
            ex.printStackTrace();
        }
    }
}