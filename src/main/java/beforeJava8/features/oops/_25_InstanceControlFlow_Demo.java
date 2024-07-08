package beforeJava8.features.oops;

public class _25_InstanceControlFlow_Demo {

    private String m1(String msg){
        System.out.println(msg);
        return msg;
    }

    public _25_InstanceControlFlow_Demo(){
        m = m1("1");
    }

    {
        m = m1("2");
    }

    String m = m1("3");
    public static void main(String[] args) {

        Object object = new _25_InstanceControlFlow_Demo();
    }
}
