package preparation.revise_1.sblock;

public class StaticBlockDemo {

    public static void main(String[] args){
        System.out.println("Main Method");
        StaticBlockDemo.staticMethod();
        StaticBlockDemo staticBlockDemo = new StaticBlockDemo();
        staticBlockDemo.instanceMethod();
    }

    public static void staticMethod(){
        System.out.println("Static Method");
    }

    public void instanceMethod(){
        System.out.println("Instance Method");
    }

    static {
        System.out.println("Static Block");
    }
}
