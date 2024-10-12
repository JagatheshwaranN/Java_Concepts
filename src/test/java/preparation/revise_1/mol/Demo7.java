package preparation.revise_1.mol;

public class Demo7 {

    public static void main(String[] ar){
        add(1, 2);
        // Widening
        add(2L, 3);
        sub(4, 3);
        sub(5L, 4);
        //Narrowing
        sub((long) 6.0, 5);
    }

    public static void add(long a, long b){
        System.out.println("LONG+LONG ==> "+(a+b));
    }

    public static void add(int a, int b){
        System.out.println("INT+INT ==> "+(a+b));
    }

    public static void sub(long a, long b){
        System.out.println("LONG-LONG ==> "+(int)(a-b));
    }

    public static void sub(int a, int b){
        System.out.println("INT-INT ==> "+(a-b));
    }

}
