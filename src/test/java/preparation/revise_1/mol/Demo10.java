package preparation.revise_1.mol;

public class Demo10 {

    public static  void main(String[] ar){
        new Demo10();
        new Demo10(1);
        new Demo10(1, 2);
    }

    Demo10(){
        System.out.println("No Arg Constructor");
    }

    Demo10(int a){
        System.out.println("Single Arg Constructor");
    }

    Demo10(int a, int b){
        System.out.println("Multiple Arg Constructor");
    }
}

