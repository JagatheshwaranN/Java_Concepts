package preparation.revise_1.mol;

public class Demo6 {

    public static void main(String[] ar){

        add(5, (Integer)10);

        // Ambiguity arises here. Bcoz, the below 2 add methods will match and
        // the compiler is confused to call the method.
        // add(15, 20);
    }

    public static void add(Integer a, int b){
        System.out.println("INTEGER+INT ==> "+(a+b));
    }

    public static void add(int a, Integer b){
        System.out.println("INT+INTEGER ==> "+(a+b));
    }
}
