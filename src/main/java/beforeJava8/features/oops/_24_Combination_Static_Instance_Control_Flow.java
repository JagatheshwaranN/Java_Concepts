package beforeJava8.features.oops;

public class _24_Combination_Static_Instance_Control_Flow {

    {
        System.out.println("First Instance Block");
    }

    static {
        System.out.println("First Static Block");
    }

    _24_Combination_Static_Instance_Control_Flow(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {

        _24_Combination_Static_Instance_Control_Flow object1 = new _24_Combination_Static_Instance_Control_Flow();
        System.out.println("Main Method");
        _24_Combination_Static_Instance_Control_Flow object2 = new _24_Combination_Static_Instance_Control_Flow();

    }

    static{
        System.out.println("Second Static Block");
    }

    {
        System.out.println("Second Instance Block");
    }
}
