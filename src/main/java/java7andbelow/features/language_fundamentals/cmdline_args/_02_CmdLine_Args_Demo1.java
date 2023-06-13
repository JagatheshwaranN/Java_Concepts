package java7andbelow.features.language_fundamentals.cmdline_args;

public class _02_CmdLine_Args_Demo1 {

    public static void main(String[] args) {

        for(int i = 0; i< args.length; i++) {
            System.out.println(args[i]);
        }
    }

    /*
        Output
        ======
        A
        B
        C
    */
}
