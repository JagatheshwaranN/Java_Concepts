package java7andbelow.features.language_fundamentals.variables;

public class _05_Static_Variable_Demo {

    static int i1 = 10;
    static int i2;
    static String s1;
    static int i3 = 20;
    int i4 = 30;

    public static void main(String[] args) {

        _05_Static_Variable_Demo demo = new _05_Static_Variable_Demo();
        System.out.println(demo.i1); // Not recommended approach
        demo.i3 = 200;
        demo.i4 = 300;

        _05_Static_Variable_Demo demo1 = new _05_Static_Variable_Demo();
        System.out.println(demo1.i3); // 200
        System.out.println(demo1.i4); // 30

        System.out.println(i1); // Not recommended approach

        // Initialized Value
        System.out.println(_05_Static_Variable_Demo.i1); // Recommended approach

        // Default Value
        System.out.println(_05_Static_Variable_Demo.i2); // 0
        System.out.println(_05_Static_Variable_Demo.s1); // null

        _05_Static_Variable_Demo.staticVarDemo();
    }

    public static void staticVarDemo() {
        System.out.println(_05_Static_Variable_Demo.i1);
    }
}
