package preparation.revise_1.mol;

public class Demo5 {

    public static void main(String[] ar){
        // Autoboxing - Primitive to Wrapper
        add(10, 15);

        // AutoUnboxing - Wrapper to Primitive
        sub(Integer.valueOf(20), 15);

    }

    public static void add(Integer a, Integer b){
        System.out.println("INTEGER+INTEGER ==> "+(a+b));
    }

    public static void sub(int a, Integer b)
    {
        System.out.println("INT-INTEGER ==> "+(a-b));
    }

}
