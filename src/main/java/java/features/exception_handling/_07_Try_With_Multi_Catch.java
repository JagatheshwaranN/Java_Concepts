package java.features.exception_handling;

public class _07_Try_With_Multi_Catch {

    public static void main(String[] args) {

        /*
            Try with Multiple Catch Blocks
            ==============================
            The way of handling an exception is varied from exception to exception. Hence,
            for each exception type it's highly recommended to take separate catch blocks.
            i.e., try with multiple catch blocks is always possible and recommended to use.

            Example,
            Worst programming practice
            ==========================
            class Test {
            try {
            Risky code;
            }
            catch (Exception ex) {
            }
            }

            Best programming practice
            =========================
            class Test {
            try {
            Risky code;
            }
            catch (ArithmeticException ex) {
            }
            catch (SQLException ex) {
            }
            catch (FileNotFoundException ex) {
            }
            catch (Exception ex) {
            }
            }
        */

        /*
            Note:
            =====
            If try with multiple catch blocks is present, then the order of the catch
            block is very important. We have to take the child first and then parent.
            Otherwise, we will get the compile time error saying Exception XXXX has
            already been caught.
        */
        CatchBlockOrderDemo1 demo1 = new CatchBlockOrderDemo1();
        demo1.method();
        CatchBlockOrderDemo2 demo2 = new CatchBlockOrderDemo2();
        demo2.method();

        /*
            Note:
            ====
            We can’t declare two catch blocks for the same exception. Otherwise,
            we will get the compile time error.
        */
    }
}

class CatchBlockOrderDemo1 {
    public void method(){
        try{
            System.out.println(10/0);
        }catch(Exception e){
            e.getMessage();
        }
        // catch (ArithmeticException e){ - exception java.lang.ArithmeticException has already been caught
        //    e.getMessage();
        //}
    }
}

class CatchBlockOrderDemo2 {
    public void method(){
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            e.getMessage();
        }catch (Exception e){
            e.getMessage();
        }
    }
}

class MultiSameCatchBlockDemo {
    public void method(){
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            e.getMessage();
        }
        // catch(ArithmeticException e){ - exception java.lang.ArithmeticException has already been caught
        //    e.getMessage();
        // }
    }
}