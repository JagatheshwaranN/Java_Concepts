package preparation.revise_1.mol;

public class Demo12 {

    public static void main(String[] args){
        Demo12.processNumber(10);
        Demo12.processNumber((Integer) 20);
    }

    public static void processNumber(int a){
        System.out.println("INT ==> "+a);
    }

    public static void processNumber(Integer a){
        System.out.println("INTEGER ==> "+a);
    }

}
