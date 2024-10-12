package preparation.revise_1.mol;

public class Demo2 {

    public static void main(String[] args){
        add(1, 2);
        add(1, 2, 3);
        add(1.0F, 2.0F);
        add(1.0F, 2.0F, 3.0F);
        add((int)1.0, 2.0F);
        add((int)3.0, (float)4);

    }

    public static void add(int a, int b){
        System.out.println("INT+INT ==> "+(a+b));
    }

    public static void add(int a, int b, int c){
        System.out.println("INT+INT+INT ==> "+(a+b+c));
    }

    public static void add(float a, float b, float c){
        System.out.println("FLOAT+FLOAT+FLOAT ==> "+(a+b+c));
    }

    public static void add(float a, float b){
        System.out.println("FLOAT+FLOAT ==> "+(a+b));
    }

    public static void add(int a, float b){
        System.out.println(a);
        System.out.println(b);
        System.out.println("INT+FLOAT ==> "+(a+b));
    }

    public static void add(float a, int b){
        System.out.println("FLOAT+INT ==> "+(a+b));
    }
}
