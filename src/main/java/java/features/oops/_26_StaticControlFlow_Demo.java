package java.features.oops;

public class _26_StaticControlFlow_Demo {
    private static String m1(String msg){
        System.out.println(msg);
        return msg;
    }
    static String m = m1("1");
    {
        m = m1("2");
    }
    static {
        m = m1("3");
    }

    int x = 10;
    public static void main(String[] args) {

        Object object = new _26_StaticControlFlow_Demo();

        /*
            Note:
            =====
            From static area, we can’t access the instance members directly because
            while executing the static area JVM may not identify the instance members.
        */
        // System.out.println(x); - non-static variable x cannot be referenced from a static context

    }
}
