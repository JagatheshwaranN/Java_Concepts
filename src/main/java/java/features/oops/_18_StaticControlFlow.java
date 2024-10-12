package java.features.oops;

public class _18_StaticControlFlow {

    static int i = 10;

    static {
        m1();
        System.out.println("Direct Read : "+i);
        System.out.println("First static block");
    }

    public static void main(String[] args) {

        /*
            Static Control Flow
            ===================
            Whenever we are executing a Java class, the following sequence of steps will be
            executed as part of the static control flow.
            1.	Identification of static members from top to bottom.
            2.	Execution of static variables assignments and static blocks from top to bottom.
            3.	Execution of main method.
        */

        /*
            Note:
            =====
            During identification of static variables, the default value will be assigned to
            static variables. During execution of static variables, the original value will
            be assigned.
            i = 0[RIWO]
            j = 0[RIWO]
            i = 10[R&W]
            j = 20[R&W]
        */
        m1();
        System.out.println("Main Method");

        /*
            Read Indirectly Write Only
            ==========================
            Inside static block, if we are trying to read a static variable that read operation
            is called as Direct Read. If we are calling a method and within that method if we are
            trying to read a static variable that read operation is called as Indirect Read.
        */
    }

    private static void m1() {
        System.out.println("Indirect Read : "+j);
    }

    static {
        System.out.println("Second static block");
    }

    static int j = 20;
}
