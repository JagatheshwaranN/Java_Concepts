package java.features.language_fundamentals.cmdline_args;

public class _04_CmdLine_Args_Demo3 {

    public static void main(String[] args) {

        args = new String[]{"X", "Y", "Z"};

        for (String arg : args) {
            System.out.println(arg);
        }
    }

   /*
        CmdLine Args
        ===========
        A B C

        Output
        ======
        X
        Y
        Z
   */
}
