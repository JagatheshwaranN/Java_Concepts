package preparation.revise_1.mol;

import java.util.Arrays;

public class Demo3 {

    public static void main(String[] args){
        add(1);
        add(1, 2);
        add(1, 2, 3);
        add();
        sum(new int[]{1, 2, 3, 4, 5});
        sum(1, 2, 3, 4, 5);
    }

    /*
        Both are internally same.
    ===================================
    public static void add(int[] a){
        System.out.println(a);
    }

    public static void add(int... a){
        System.out.println(a);
    }
    */

    public static void add(int a){
        System.out.println("INT ==> "+a);
    }

    public static void add(int a, int b){
        System.out.println("INT+INT ==> "+(a+b));
    }

    public static void add(int a, int b, int c){
        System.out.println("INT+INT+INT ==> "+(a+b+c));
    }

    public static void add(int... a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        System.out.println("VarArg ==> "+sum);
    }

    public static void sum(int[] a){
        System.out.println("Arrays ==> "+ Arrays.toString(a));
    }

    public static void sum(int a, int... b){
//        int sum = 0;
//        for(int i : b){
//            sum += i;
//        }
        System.out.print("VarArg ==> "+ + a + ", ");
        System.out.println( Arrays.toString(b));
    }

}
