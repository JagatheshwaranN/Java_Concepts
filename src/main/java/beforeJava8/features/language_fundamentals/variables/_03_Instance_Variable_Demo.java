package beforeJava8.features.language_fundamentals.variables;

public class _03_Instance_Variable_Demo {

    int i1;
    int i2 = 10;
    String s1;
    String s2 = "instance";

    public static void main(String[] args) {

        // System.out.println(i1); - non-static variable i1 cannot be referenced from a static context

        _03_Instance_Variable_Demo demo = new _03_Instance_Variable_Demo();

        // Default Value
        System.out.println(demo.i1);
        System.out.println(demo.s1);

        //Initialized Value
        System.out.println(demo.i2);
        System.out.println(demo.s2);
    }
}
