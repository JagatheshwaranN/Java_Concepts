package java7andbelow.features.language_fundamentals.variables;

public class _05_Static_Variable_Demo {

    static int i1 = 10;

    public static void main(String[] args) {

        System.out.println(i1);

        System.out.println(_05_Static_Variable_Demo.i1);

        _05_Static_Variable_Demo demo = new _05_Static_Variable_Demo();
        System.out.println(demo.i1);
    }
}
