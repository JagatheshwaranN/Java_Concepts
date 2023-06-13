package java7andbelow.features.language_fundamentals.cmdline_args;

public class _04_CmdLine_Args_Demo3 {

    public static void main(String[] args) {

        String[] ar = {"X", "Y", "Z"};
        args = ar;

        for(int i = 0; i< args.length; i++) {
            System.out.println(args[i]);
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
