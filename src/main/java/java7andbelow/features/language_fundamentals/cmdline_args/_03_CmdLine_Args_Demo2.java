package java7andbelow.features.language_fundamentals.cmdline_args;

public class _03_CmdLine_Args_Demo2 {

    public static void main(String[] args) {

        for(int i = 0; i< args.length; i++) {
            System.out.println(args[i]);
        }
    }

    /*
        Output
        ======
        Text Book
        Ink Pen
        Pencil Box
    */
}
