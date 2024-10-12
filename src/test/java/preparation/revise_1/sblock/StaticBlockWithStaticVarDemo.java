package preparation.revise_1.sblock;

public class StaticBlockWithStaticVarDemo {

    static int val;
    public static void main(String[] args){
        System.out.println("Main Method");
    }

    static {
        val = 10;
        System.out.println("Static Block");
        display();
    }

    public static void display(){
        System.out.println("Static variable val : "+ val);
    }
}
